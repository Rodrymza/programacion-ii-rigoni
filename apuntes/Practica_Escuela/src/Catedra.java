import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private int codigo;
    private String denominacion;
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public Catedra(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }
    public Catedra() {}

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
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

    public Alumno mejorAlumnoCatedra() {
        Alumno mejorPromedio = null;
        for (Alumno alumno : alumnos) {
            if (mejorPromedio == null || alumno.mejorNota(codigo) > mejorPromedio.mejorNota(codigo)) {
                mejorPromedio = alumno;
            }
        }
        return mejorPromedio;
    }
}