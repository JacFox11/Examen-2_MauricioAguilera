
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminUsuarios {
    private ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo = null;

    public AdminUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminUsuarios{" + "usuarios=" + usuarios + '}';
    }
    
    public void cargarArchivo() {
        try {
            usuarios = new ArrayList();
            Usuario temp;
            if (archivo.exists()){
                try {
                    FileInputStream entrada = new FileInputStream(archivo);
                    ObjectInputStream objeto = new ObjectInputStream(entrada);
                    while ((temp = (Usuario) objeto.readObject()) != null){
                        usuarios.add(temp);
                    }
                } catch (EOFException e) {
                    
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : usuarios) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (IOException ex) {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
            }
        }
    }
}
