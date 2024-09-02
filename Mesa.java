package logica;

public class Mesa {

    private int numeroMesa; // numero de referencia de la mesa

    private boolean disponible;  // Estado de reservacion de la mesa.

    private int tipo; // Capacidad de la mesa.

    private String ocupante = "vacio"; // ocupante: en caso de que este reservada que pueda saber quien la reservo.


    /**Metodo
     * cuando se realiza una reservacion se cambia el estado y se coloca el nombre del ocupante.
     * @param ocupante
     */
    public void ocupar(String ocupante) {
        if (ocupante.equals("vacio")) {
            this.disponible = false;
            this.ocupante = ocupante;
        }
    }

    /**Metodo
     * Cuando se registra una cancelacion.
     */
    public void cancelar(){
        this.disponible = true;
        this.ocupante = "vacio";
    }

    public boolean getEstado() {  return disponible; } // retorna el estado de reservacion de la mesa.

    public boolean setDisponible(boolean reservado) {
        return disponible = reservado; //cambia el estado de disponibilidad de la mesa
    }

    public int getCapacidad() {  return tipo; } //retorna la capacidad de la mesa.

    /** contructor:
     * se inicializa creando el objeto solo tomando como argumento la capacidad de la mesa.
     * @param tipo
     */
    public Mesa(int numero, int tipo) {
        this.numeroMesa = numero;
        this.tipo = tipo;
    }





}
