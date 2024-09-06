package logica;
import java.time.LocalDateTime;
public class Precio {
    private float precio;
    private double total;

    /**
     * Crea un objeto precio.
     * @param cobro
     */
    public Precio(float cobro){
        this.precio = cobro;
    }

    /**
     * Devuelve el precio de la reservacion.
     * @return el total a pagar por la reservacion
     */
    public double getTotal() {return total;}

    //la cosa es que el

    /**Metodo.
     * Genera el cobro de la reservacion en una fecha actual o futura.
     * @param fecha
     * el total lo ingresa en el atributo total.
     */
    public void cobrar(LocalDateTime fecha){
        double cobro = 0;
        LocalDateTime actual = LocalDateTime.now();
        if(fecha.getDayOfYear() == actual.getDayOfYear()){
            if(fecha.isAfter(actual)){
                cobro = this.precio * 1.5;
            }
            else{
                cobro = -1;
            }
        } else if (fecha.getDayOfYear() < actual.getDayOfYear()) {
            cobro = -1;
        }
        else {
            cobro = this.precio;
        }
        this.total = cobro;
    }
}
