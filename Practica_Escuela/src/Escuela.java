import java.util.ArrayList;

public class Escuela {
    private int numero;
    private String denominacion;
    private ArrayList<DivisionCurso> divisiones;

    public Escuela(int numero, String denominacion) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.divisiones = new ArrayList<>();
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


