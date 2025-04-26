import java.util.ArrayList;
import java.util.Iterator;

public class Supermercado {
    private ArrayList<Producto> inventario;

    public Supermercado() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : inventario) {
            if (producto.tieneNombre(nombre)) {
                return producto;
            }
        }
        System.out.println("Producto no encontrado");
        return null;
    }

    public void realizarCompra(Cliente cliente) {
        if (cliente.getCarrito().size() == 0) {
            System.out.println("El carrito está vacío.");
            return;
        } else {
            Iterator productoActual = cliente.getCarrito().iterator();
            while (productoActual.hasNext()) {
                Producto producto = (Producto) productoActual.next();
                Producto productoInventario = buscarProducto(producto.getNombre());
                if (productoInventario != null) {
                    if (productoInventario.getCantidad() >= producto.getCantidad()) {
                        productoInventario.setCantidad(productoInventario.getCantidad() - producto.getCantidad());
                        System.out.println("Nombre : " + producto.getNombre() + " Cantidad: " + producto.getCantidad() + " Precio: $" + producto.getPrecio() + " Total: $" + (String.format("%.2f",producto.getPrecio() * producto.getCantidad())));
                    } else {
                        System.out.println("No hay suficiente stock de " + producto.getNombre());
                        productoActual.remove();
                    }
                } else {
                    System.out.println("El producto " + producto.getNombre() + " no está en el inventario.");
                }
            }
        }
        System.out.println("Total de la compra $" + String.format("%.2f",cliente.calcularTotalCompra()));

    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Producto producto : inventario) {
            producto.mostrarProducto();
        }
    }
}
