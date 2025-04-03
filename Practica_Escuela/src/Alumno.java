import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Alumno {
    private long legajo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private ArrayList<Nota> notas;

    public Alumno(long legajo, String nombre, String apellido, Date fechaNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.notas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return legajo == alumno.legajo && Objects.equals(nombre, alumno.nombre) && Objects.equals(apellido, alumno.apellido) && Objects.equals(fechaNacimiento, alumno.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legajo, nombre, apellido, fechaNacimiento);
    }

    public void agregarNota(Nota nota) {
        this.notas.add(nota);
    }
}
