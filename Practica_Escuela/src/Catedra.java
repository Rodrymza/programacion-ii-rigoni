import java.util.ArrayList;

public class Catedra {
    private int codigo;
    private String denominacion;
    private ArrayList<Alumno> alumnos;

    public Catedra(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.alumnos = new ArrayList<>();
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