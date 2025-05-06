import java.util.Date;

public class Ticket implements Imprimible {
    private Date fecha;
    private Cliente cliente;
    private double total;

    public Ticket(Date fecha, Cliente cliente, double total) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "fecha=" + fecha +
                ", cliente=" + cliente +
                ", total=" + total +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }
}
