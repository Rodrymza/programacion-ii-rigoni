import java.util.ArrayList;
import java.util.List;

public class DivisionCurso {
    private int codigo;
    private int anio;
    private int division;
    private Escuela escuela;
    private List<Catedra> catedras = new ArrayList<>();

    public DivisionCurso(int codigo, int anio, int division) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
    }

    public DivisionCurso(int codigo, int anio, int division, Escuela escuela) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
        this.escuela = escuela;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public Escuela getEscuela() {
        return escuela;
    }
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
