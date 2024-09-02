package logica;
import java.time.LocalDateTime;
public class Precio {
    private float precio = 15000;
    private LocalDateTime fecha;
    private float añadido;

    // falta cuadrar bein esto con respecto al añadido en cuanto menor sea el plazo para la reserva.
    public Precio(LocalDateTime hora ){
        LocalDateTime actual = LocalDateTime.now();
        if(actual.getDayOfYear() == hora.getDayOfYear()  ){
            añadido = 0.50;
        }
        if (actual.getDayOfYear() < hora.getDayOfYear()+3) {
            añadido = 0.40;
        }
    }
}
