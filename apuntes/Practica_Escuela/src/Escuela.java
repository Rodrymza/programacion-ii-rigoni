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
}


