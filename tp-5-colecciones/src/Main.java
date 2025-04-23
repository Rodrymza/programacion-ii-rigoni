public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarProducto(new Producto("1001", "Lomitos de atún 170gr", 2500, 10, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("1002", "Cerveza 355ml", 2300, 20, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("1103", "Parlante Bluetooth BTS", 12000, 15, CategoriaProducto.ELECTRONICA));
        inventario.listarProductos();
    }
}