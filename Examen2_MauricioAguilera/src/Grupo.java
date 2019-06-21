
import java.util.ArrayList;


public class Grupo extends Chat{
    private String nombre;
    private ArrayList <Usuario> usuarios = new ArrayList();
    private Usuario admin;
    private ArrayList <Mensajes> mensajes = new ArrayList();

    public Grupo(String nombre, Usuario admin) {
        this.nombre = nombre;
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario getAdmin() {
        return admin;
    }

    public void setAdmin(Usuario admin) {
        this.admin = admin;
    }

    public ArrayList<Mensajes> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensajes> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
