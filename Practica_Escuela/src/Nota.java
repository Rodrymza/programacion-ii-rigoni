import java.util.Date;

public class Nota {
    private static int id;
    private double valor;
    private Date fechaExamen;
    boolean esRecuperatorio;

    public Nota(double valor, Date fechaExamen, boolean esRecuperatorio) {
        this.valor = valor;
        this.fechaExamen = fechaExamen;
        this.esRecuperatorio = esRecuperatorio;
        id++;
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
}
