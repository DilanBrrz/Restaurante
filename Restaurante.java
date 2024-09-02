package logica;

//inportaciones de diferentes librerias.
import logica.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Mesa> mesas; //Atributo que contiene vector de objetos tipo mesa.
    private List<Reserva> reservas; //Atributo que contine vector de objetos tipo reserva.

    /**Constructor
     * crea un objeto restaurante y recibe como parametro la cantidad de mesas que puede albergar.
     * @param numeroMesas
     * (podria haber un opcion para tomar un pocentaje de preferencia de mesas)
     */
    public Restaurante(int numeroMesas) {
        mesas = new ArrayList<>(); //Se genera atributo mesas de tipo vector.
        reservas = new ArrayList<>(); //Se genera atributo reservas de tipo vector.

        // Inicializar mesas con diferentes capacidades
        for (int i = 1; i <= numeroMesas; i++) {
            mesas.add(new Mesa(i, (i % 2 == 0) ? 4 : 2));  // Alterna entre mesas de 2, 4, y 6 personas
        }
    }

    /**Metodo
     * Hace el registro de una persona que ha llamado para una reservacion.
     * Indica la fecah de dicha reservacion y se le cobra de acuerdo a el tiempo que falte para esa fecha.
     * El cobro es generado a partir de una tarifa base y un añadido que toma valor si el tiempo es inferior a 7 dias.
     * @param cliente
     * @param fechaHora
     * @param numeroPersonas
     * @param precio
     * (No se ha integrado para que se puedan realizar dos reservaciones de la misma mesa pero en distinta fecha).
     */
    public void registrarReserva(Cliente cliente, LocalDateTime fechaHora, int numeroPersonas, Precio precio) {
        Mesa mesaDisponible = buscarMesaDisponible(numeroPersonas); // utiliza un metodo Y
                                                                    // el objeto que retorna lo guarda en la variable.

        //Condicional de que si hay un mesa.
        if (mesaDisponible != null) {
            //Crea un objeto de la calse reserva
            Reserva nuevaReserva = new Reserva(cliente, mesaDisponible, fechaHora, numeroPersonas, precio);
            reservas.add(nuevaReserva);// añade dicho objeto al atributo vector reservas.
            mesaDisponible.setDisponible(false); //Cambia el estado de la mesa a reservada.
            System.out.println("Reserva confirmada: " + nuevaReserva);//imprime que la reserva se realizo con exito.
        } else { // en caso de que todas las mesas de esa capacidad esten ocupadas.
            System.out.println("No hay mesas disponibles para " + numeroPersonas + " personas."); //imprime que no se pudo realizar la reserva.
        }
    }

    /**Metodo
     * Funcion de cancelar una reserva anteriormente registrada.
     * @param reserva
     */
    public void cancelarReserva(Reserva reserva) {
        reserva.getMesa().setDisponible(true);//Cambia el estado de la mesa la cual se habia reservado a disponible.
        System.out.println("Reserva cancelada: " + reserva);// imprime que la funcion se realizo con exito.
        // (C)no se si vaya primero el mensaje o no habria que probar si deja imprimir el mesaje con la informacion.
        reservas.remove(reserva); //elimina la reserva del vector de reservas.
    }

    /**Metodo
     * Muestra en pantalla todas las reservaciones de un fecha en especifico.
     * @param fecha
     */
    public void mostrarReservas(LocalDateTime fecha) {
        System.out.println("Reservas para el día " + fecha.toLocalDate() + ":");// imprime una referencia con la fecha.
        //Inicializa un bucle con la cantidad de objectos del vector reservas.
        for (Reserva reserva : reservas) {
            //Condicional verifica que la fecha de la reserva sea igual a la que digito.
            if (reserva.getFechaHora().toLocalDate().equals(fecha.toLocalDate())) {
                System.out.println(reserva);//imprime los datos de la reserva.
            }
        }
    }

    /**Metodo
     * Busca si hay una mesa de la capacidad especificada.
     * @param numeroPersonas
     * @return el objeto de la clase mesa con dicha capacidad.
     */
    private Mesa buscarMesaDisponible(int numeroPersonas) {
        // Inicializa un bucle con la cantidad de objetos del vector mesas.
        for (Mesa mesa : mesas) {
            //Verifica si dicha mesa no esta reservada y si cumple con la capacidad ingresada
            if (!mesa.getEstado() && mesa.getCapacidad() >= numeroPersonas) {
                return mesa; // retorna la mesa.
            }
        }
        return null;  // No hay mesas disponibles
    }
}


































































