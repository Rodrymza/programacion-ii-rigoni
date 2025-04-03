import java.util.ArrayList;

public class DivisionCurso {
    private int codigo;
    private int anio;
    private int division;
    private ArrayList<Catedra> catedras;

    public DivisionCurso(int codigo, int anio, int division) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
        this.catedras = new ArrayList<>(); // Inicializa el arreglo de cátedras vacío
    }

    public void agregarCatedra(Catedra catedra) {
        this.catedras.add(catedra);
    }

    @Override
    public String toString() {
        return "DivisionCurso{" +
                "codigo=" + codigo +
                ", anio=" + anio +
                ", division=" + division +
                '}';
    }
}
