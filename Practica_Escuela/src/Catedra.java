import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private int codigo;
    private String denominacion;
    private List<Alumno> alumnos = new ArrayList<>();

    public Catedra(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }
    public Catedra(int codigo, String denominacion, List<Alumno> alumnos) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.alumnos = alumnos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
        }

    @Override
    public String toString() {
        return "Catedra{" +
                "codigo=" + codigo +
                ", denominacion='" + denominacion + '\'' +
                '}';
    }
}