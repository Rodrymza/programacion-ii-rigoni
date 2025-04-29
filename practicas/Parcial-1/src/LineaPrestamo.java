import java.util.Date;

public class LineaPrestamo {
    private Date fechaDevolucionEstimada;
    private Ejemplar ejemplar;

    public LineaPrestamo() {
    }

    public LineaPrestamo(Date fechaDevolucionEstimada, Ejemplar ejemplar) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
        this.ejemplar = ejemplar;
    }

    public LineaPrestamo(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Date getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public void setFechaDevolucionEstimada(Date fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public void mostraLineaPrestamo(){
        System.out.println("Ejemplar: " + ejemplar.getCodigo() + " - " + ejemplar.getPublicacion().getTitulo() + " - Devolucion estimada " + fechaDevolucionEstimada);
    }
}
