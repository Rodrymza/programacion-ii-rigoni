import java.util.ArrayList;
import java.util.Date;

public class CarritoDeCompra {
    private Date creado;
    private ArrayList<ProductoDeLinea> productosDeLineas;

    public CarritoDeCompra() {}

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public ArrayList<ProductoDeLinea> getProductosDeLineas() {
        return productosDeLineas;
    }

    public void setProductosDeLineas(ArrayList<ProductoDeLinea> productosDeLineas) {
        this.productosDeLineas = productosDeLineas;
    }

    public void agregarProducto(ProductoDeLinea producto) {
        productosDeLineas.add(producto);
        System.out.println("Producto " + producto.getNombre() + " agregado al carrito");
    }

    public boolean estaVacio() {
        return productosDeLineas.size() == 0;
    }
}
