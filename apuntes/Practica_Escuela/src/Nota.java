import java.util.Date;

public class Nota {
    private static int id;
    private double valor;
    private Date fechaExamen;
    private boolean esRecuperatorio;
    private Catedra catedra;
    private Alumno alumno;

    public Nota(double valor, Date fechaExamen, boolean esRecuperatorio) {
        this.valor = valor;
        this.fechaExamen = fechaExamen;
        this.esRecuperatorio = esRecuperatorio;
        id++;
    }

    public Nota() {
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Nota.id = id;
    }

    @Override
    public String toString() {
        String recuperatorio = (esRecuperatorio) ? "Recuperatorio" : "Regular";
        return "Nota{" +
                "valor=" + valor +
                ", fechaExamen=" + fechaExamen +
                ", " + recuperatorio +
                '}';
    }

    public boolean esRecuperatorio() {
        return esRecuperatorio;
    }
}
