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
            System.out.println("-------------------------");
            System.out.println("Lista de productos:");
            for (Producto producto : productos) {
                producto.mostrarInfo();
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

    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }

    public Producto obtenerProductoMayorStock() {
        int mayorStock = 0;
        Producto productoMayorStock = null;
        for (Producto producto : productos) {
            if (producto.getCantidad() > mayorStock) {
                mayorStock = producto.getCantidad();
                productoMayorStock = producto;
            }
        }
        return productoMayorStock;
    }

    public ArrayList<Producto> filtrarProductoPrecio(double minimo, double maximo) {
        ArrayList<Producto> listaFiltrada = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= minimo && producto.getPrecio() <= maximo) {
                listaFiltrada.add(producto);
            }
        }
        return listaFiltrada;
        }

    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria.getDescripcion());
        }
    }
}
