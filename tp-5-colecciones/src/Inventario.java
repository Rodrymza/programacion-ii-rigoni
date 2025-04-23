import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("Lista de productos:");
            for (Producto producto : productos) {
                System.out.println("-------------------------");
                System.out.println(producto.mostrarInfo());
            }
            System.out.println("-------------------------");
        }
    }

    public Producto buscarProductoPorId(String id) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            System.out.println("Se eliminó el producto " + producto.getNombre() + " del inventario");
            productos.remove(producto);
        } else {
            System.out.println("El producto con ID " + id + " no se encontró en el inventario.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("Cantidad de " + producto.getNombre() + " actualizada a: " + nuevaCantidad);
        } else {
            System.out.println("El producto con ID " + id + " no se encontró en el inventario.");
        }
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosCategoria = new ArrayList<>();
        for (Producto productoActual : productos ) {
            if (productoActual.getCategoria().equals(categoria)) {
                productosCategoria.add(productoActual);
            }
        }
        if (productosCategoria.isEmpty()){
            System.out.println("No hay productos en la categoría " + categoria);
        }
        return productosCategoria;
    }
}
