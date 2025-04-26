import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private int numero;
    private String denominacion;
    private List<DivisionCurso> divisiones = new ArrayList<>();

    public Escuela(int numero, String denominacion) {
        this.numero = numero;
        this.denominacion = denominacion;
    }
    public Escuela (int numero, String denominacion, List<DivisionCurso> divisiones) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.divisiones = divisiones;
    }

    public int getNumero() {
        return numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void agregarDivision(DivisionCurso division) {
        this.divisiones.add(division);
    }

    @Override
    public String toString() {
        return "Escuela{" +
                "numero=" + numero +
                ", denominacion='" + denominacion + '\'' +
                '}';
    }

    public Alumno mejorAlumnoEscuela(int anioNacimiento) {
        Alumno mejor = null;
        for (DivisionCurso division : divisiones) {
            Alumno candidato = division.mejorAlumnoDivision();
            //no compruebo que no haya desaprobado examenes porque ya se comprueba en la clase DivisionCurso al poner como condicional que no haya recuperatorios
            if (mejor == null && candidato.getFechaNacimiento().getYear() == anioNacimiento) {
                mejor = candidato;
            } else if (mejor.promedioNotas(null) < candidato.promedioNotas(null) && candidato.getFechaNacimiento().getYear() == anioNacimiento) {
                mejor = candidato;
            }
        }
        return mejor;
    }

    public ArrayList<Alumno> mejoresAlumnos(int anioNacimiento) {
        ArrayList<Alumno> mejoresAlumnos = new ArrayList<>();
        for (DivisionCurso division : divisiones) {
            if (division.mejorAlumnoDivision().getFechaNacimiento().getYear() == anioNacimiento) {
                mejoresAlumnos.add(division.mejorAlumnoDivision());
            }
        }
        mejoresAlumnos.sort((a1, a2) -> Double.compare(a2.promedioNotas(null), a1.promedioNotas(null)));
        return  (mejoresAlumnos.size() > 3) ? new ArrayList<>(mejoresAlumnos.subList(0, 3)) : mejoresAlumnos;
    }
}


