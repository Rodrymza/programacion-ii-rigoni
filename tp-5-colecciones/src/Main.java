import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarProducto(new Producto("1001", "Lomitos de atún 170gr", 2500, 10, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("1002", "Cerveza 355ml", 2300, 20, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("1103", "Parlante Bluetooth BTS", 12000, 15, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("1104", "Cargador USB", 5000, 30, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("1205", "Camiseta de algodón", 1500, 25, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("1206", "Pantalón de mezclilla", 3000, 15, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("1307", "Sofá de 3 plazas", 50000, 5, CategoriaProducto.HOGAR));
        inventario.listarProductos();

        //busquda de producto por id
        System.out.println("Busqueda de producto id 1001");
        Producto productoBuscado = inventario.buscarProductoPorId("1001");
        if (productoBuscado != null) {
            System.out.println("Producto encontrado:");
            productoBuscado.mostrarInfo();
        } else {
            System.out.println("El producto no se encontró.");
        }

        //filtrar productos eletronica y listarlos
        System.out.println("Filtrando productos por categoría ELECTRONICA");
        ArrayList<Producto> productosElectronica = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        System.out.println("Productos de la categoría ELECTRONICA:");
        for (Producto producto : productosElectronica) {
            producto.mostrarInfo();
        }

        //eliminar por ID y listar los restantes
        System.out.println("Eliminando producto con ID 1307");
        inventario.eliminarProducto("1307");
        inventario.listarProductos();
    }
}