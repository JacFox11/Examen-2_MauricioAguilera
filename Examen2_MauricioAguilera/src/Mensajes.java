
import java.util.Date;


public class Mensajes {
    private String contenido;
    private Date hora;
    private Date fecha;
    private boolean leido;

    public Mensajes(String contenido, Date hora, Date fecha, boolean leido) {
        this.contenido = contenido;
        this.hora = hora;
        this.fecha = fecha;
        this.leido = leido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return contenido;
    }
    
    
    
}
