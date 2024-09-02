package logica;

public class Cliente {
    private String nombre;//nombre de la persona la cual quiere una mesa.
    private String telefono;// numero de telefono al cual comunicarse.

    
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Teléfono: " + telefono;
    }
}

