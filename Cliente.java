package logica;

public class Cliente {
    private String nombre;// Nombre de un reservita de mesa.
    private String telefono;// Almacena un número de telefono.

    /**Constructor
     * crea un objeto cliente.
     * @param nombre para rellenar informacion para la reservacion.
     * @param telefono en caso de comunicarse con la persona.
     */
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;// Ingresa nombre en el atributo nombre.
        this.telefono = telefono;// Ingresa numero en el atributo telefono.
    }

    /**Metodo
     * devuelve la cadena que esta en el atributo nombre.
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**Metodo
     * devuelve la cadena que esta en el atributo telefono.
     * @return telefono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Teléfono: " + telefono;
    }
}

