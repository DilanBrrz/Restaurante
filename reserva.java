package logica;
import logica.*;
import java.time.LocalDateTime;//importacion de tiempo

public class Reserva {
    private Cliente cliente;
    private Mesa mesa;
    private LocalDateTime fechaHora;
    private int numeroPersonas;
    private Precio precio;

    public Reserva(Cliente cliente, Mesa mesa, LocalDateTime fechaHora, int numeroPersonas, Precio precio) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.fechaHora = fechaHora;
        this.numeroPersonas = numeroPersonas;
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public Mesa getMesa() {
        return mesa;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public Precio getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        public String toString() {
            return "Reserva para " + cliente.getNombre() + " en la mesa " + mesa.getNumeroMesa() +
                    " a las " + fechaHora + " con precio " + precio;
        }
    }
