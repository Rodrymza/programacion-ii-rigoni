import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacion> publicaciones;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void mostrarPublicacionesDisponibles() {
        for (Publicacion publicacionActual : publicaciones) {
            publicacionActual.mostrarEjemplaresDisponibles();
        }
    }

    public void mostrarEjemplares(){
        for (Publicacion publicacion : publicaciones){
            publicacion.mostrarEjemplares();
        }
    }

}
