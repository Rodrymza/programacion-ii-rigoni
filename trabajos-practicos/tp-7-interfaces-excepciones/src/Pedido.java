import java.util.ArrayList;

public class Pedido implements Pagable{
 private ArrayList<Producto> listaProductos;

    public Pedido() {
        this.listaProductos = new ArrayList<>();
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : this.listaProductos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
    }
}
