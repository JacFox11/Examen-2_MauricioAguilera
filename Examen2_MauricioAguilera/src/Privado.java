
import java.util.ArrayList;


public class Privado extends Chat{
    private ArrayList <Mensajes> mensajes = new ArrayList();
    private Usuario recipiente;

    public Privado(Usuario recipiente) {
        this.recipiente = recipiente;
    }

    public ArrayList<Mensajes> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensajes> mensajes) {
        this.mensajes = mensajes;
    }

    public Usuario getRecipiente() {
        return recipiente;
    }

    public void setRecipiente(Usuario recipiente) {
        this.recipiente = recipiente;
    }

    @Override
    public String toString() {
        return recipiente.toString();
    }
    
    
    
}
