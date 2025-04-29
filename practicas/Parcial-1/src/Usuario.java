import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private ArrayList<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void mostrarHistorialPrestamos() {
        System.out.println("Historial de préstamos de " + nombre + " " + apellido + ":");
        for (Prestamo prestamo : prestamos) {
            prestamo.mostrarPrestamo();
        }
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
        System.out.println("Préstamo agregado");
    }
}
