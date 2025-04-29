import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private String numero;
    private Date fechaDePedido;
    private Date fechaDeEnvio;
    private EstadoDePedido estado;
    private float total;
    private ArrayList<ProductoDeLinea> productosDeLineas;
    private ArrayList<Pago> pagos;

    public Pedido() {
        this.productosDeLineas = new ArrayList<>();
        this.pagos = new ArrayList<>();
    }

    public ArrayList<ProductoDeLinea> getProductosDeLineas() {
        return productosDeLineas;
    }

    public void setProductosDeLineas(ArrayList<ProductoDeLinea> productosDeLineas) {
        this.productosDeLineas = productosDeLineas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public EstadoDePedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoDePedido estado) {
        this.estado = estado;
    }

    public Date getFechaDeEnvio() {
        return fechaDeEnvio;
    }

    public void setFechaDeEnvio(Date fechaDeEnvio) {
        this.fechaDeEnvio = fechaDeEnvio;
    }

    public Date getFechaDePedido() {
        return fechaDePedido;
    }

    public void setFechaDePedido(Date fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float calcularTotal() {
        float total = 0;
        for (ProductoDeLinea producto : productosDeLineas) {
            total += producto.getCantidad() * producto.getPrecio();
        }
        return total;
    }

    public void agregarProducto(ProductoDeLinea producto) {
        this.productosDeLineas.add(producto);
        System.out.println("Producto " + producto.getNombre() + " añadido");
    }

    public void agregarPago(Pago pago) {
        this.pagos.add(pago);
        System.out.println("Metodo de pago " + pago.getDetalles() + " añadido");
    }
}