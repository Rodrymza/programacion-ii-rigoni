import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private ArrayList<LineaPrestamo> lineas;

    public Prestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.lineas = new ArrayList<>();
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public ArrayList<LineaPrestamo> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaPrestamo> lineas) {
        this.lineas = lineas;
    }

    public void agregarLineaPrestamo(Ejemplar ejemplar) {
        if (ejemplar != null && ejemplar.estaDisponible()) {
            Date fechaDevolucionAprox = new Date (System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 15);
            LineaPrestamo nuevaLinea = new LineaPrestamo(fechaDevolucionAprox, ejemplar);
            //Fecha de devolucion estimada a 15 días
            ejemplar.setEstado(EstadoEjemplar.PRESTADO);
            lineas.add(nuevaLinea);
        } else {
            System.out.println("El ejemplar no está disponible para préstamo.");
        }
    }

    public void mostrarPrestamo(){
        String devolucion = (fechaDevolucion==null) ? "No devuelto" : fechaDevolucion.toString();
        System.out.println("Fecha de prestamo: " + fechaPrestamo + "\nDevolucion: " + devolucion);
        System.out.println("Ejemplares prestados:");
        for (LineaPrestamo linea : lineas) {
            linea.mostraLineaPrestamo();
        }
    }
}
