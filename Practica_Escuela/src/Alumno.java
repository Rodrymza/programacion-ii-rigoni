import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Alumno {
    private long legajo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private List<Nota> notas = new ArrayList<>();

    public Alumno(long legajo, String nombre, String apellido, Date fechaNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento.toString() +
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

    public double mejorNota(Integer codigoCatedra) {
        Nota mejor = new Nota();
        for (Nota nota : this.notas) {
            if (nota.esRecuperatorio()) {
                continue;
            }
            if (codigoCatedra != null && nota.getCatedra().getCodigo() == codigoCatedra) {
                if (mejor.getValor() < nota.getValor()) {
                    mejor = nota;
                }
            } else {
                if (mejor.getValor() < nota.getValor()) {
                    mejor = nota;
                }
            }
        }
        return mejor.getValor();
    }

    public double promedioNotas(Integer codigoCatedra) {
        double promedio = 0;
        int acumulador = 0;
        boolean encontrado = false;
        for (Nota nota : notas) {
            if (codigoCatedra != null && nota.getCatedra().getCodigo() == codigoCatedra) {
                promedio += nota.getValor();
                acumulador ++;
                encontrado = true;
            } else {
                promedio += nota.getValor();
                acumulador ++;
            }

        }
        return promedio/acumulador;
    }

}
