import java.util.ArrayList;

public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;
    private Publicacion publicacion;

    public Ejemplar(String codigo, EstadoEjemplar estado, Publicacion publicacion) {
        this.codigo = codigo;
        this.estado = estado;
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return publicacion.getTitulo();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public boolean estaDisponible() {
        return estado == EstadoEjemplar.DISPONIBLE;
    }

    public void mostrarEjemplar() {
        System.out.println("Ejemplar: " + codigo + " - " + publicacion.getTitulo() + " - Estado: " + estado.name());
    }
}
