import java.util.ArrayList;
import java.util.Date;

public class Cuenta {
    private String id;
    private String direccionDeFacturacion;
    private boolean estaCerrada;
    private Date abierta;
    private Date cerrada;
    private ArrayList<Pedido> pedidos;

    public Cuenta() {
        this.pedidos = new ArrayList<>();
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccionDeFacturacion() {
        return direccionDeFacturacion;
    }

    public void setDireccionDeFacturacion(String direccionDeFacturacion) {
        this.direccionDeFacturacion = direccionDeFacturacion;
    }

    public boolean isEstaCerrada() {
        return estaCerrada;
    }

    public void setEstaCerrada(boolean estaCerrada) {
        this.estaCerrada = estaCerrada;
    }

    public void abrirCuenta() {
        this.abierta = new Date();
    }

    public void cerrarCuenta(){
        this.cerrada = new Date();
        this.estaCerrada = true;
    }

    public void iniciarPedido(Pedido pedido) {
        pedido.setEstado(EstadoDePedido.PENDIENTE);
        this.pedidos.add(pedido);
        System.out.println("Pedido " + pedido.getNumero() + " añadido");
    }

}
