package logica;


public class Mesa {

    private int numeroMesa; // numero de referencia de la mesa

    private boolean disponible = true;  // Estado de reservacion de la mesa.

    private int tipo; // Capacidad de la mesa.

    /**Metodo
     *devuelve el valor booleano de el atributo disponible
     * @return si esta o no disponible para reservar.
     */
    public boolean getEstado() {  return disponible; } // retorna el estado de reservacion de la mesa.

    /**Metodo
     *Asigna valor booleano a atributo disponible.
     * @param reservado
     * @return el atributo con el valor cambiado.
     */
    public boolean setDisponible(boolean reservado) {
        return disponible = reservado; //cambia el estado de disponibilidad de la mesa
    }

    /**Metodo.
     * Devuelve la capacidad del objeto mesa.
     * @return un entero(2,4,6).
     */
    public int getCapacidad() {  return tipo; } //retorna la capacidad de la mesa.

    /**
     * Devuelve el entero en el atributo número mesa
     * @return devuelve el numero de la mesa del restaurante
     */
    public int getNumeroMesa() {  return numeroMesa; }

    /** contructor:
     * se inicializa creando el objeto solo tomando como argumento la capacidad de la mesa.
     * @param tipo
     */
    public Mesa(int numero, int tipo) {
        this.numeroMesa = numero;
        this.tipo = tipo;
    }





}
