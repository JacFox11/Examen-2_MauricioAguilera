
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauri
 */
public class Usuario extends Persona implements Serializable {
    private String usuario;
    private String password;
    private ArrayList <Chat> chats = new ArrayList();
    private ArrayList <Usuario> amigos = new ArrayList();
    private ArrayList <Usuario> solicitudes = new ArrayList();
    private int conexion;

    public Usuario(String usuario, String password, int conexion, String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
        this.usuario = usuario;
        this.password = password;
        this.conexion = conexion;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public int getConexion() {
        return conexion;
    }

    public void setConexion(int conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Usuario> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Usuario> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    @Override
    public String toString() {
        return usuario;
    }
    
    
}
