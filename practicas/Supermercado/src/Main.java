public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        Producto producto1 = new Producto("Leche", 1.50, 10);
        Producto producto2 = new Producto("Pan", 0.80, 20);
        Producto producto3 = new Producto("Carne", 5.00, 5);
        Producto producto4 = new Producto("Arroz", 2.00, 15);

        supermercado.agregarProducto(producto1);
        supermercado.agregarProducto(producto2);
        supermercado.agregarProducto(producto3);
        supermercado.agregarProducto(producto4);
        supermercado.mostrarInventario();

        Cliente cliente = new Cliente("Juan", "Pérez");
        cliente.agregarProducto(new Producto(supermercado.buscarProducto("Leche"), 2));
        cliente.agregarProducto(new Producto(supermercado.buscarProducto("Pan"), 3));
        cliente.agregarProducto(new Producto(supermercado.buscarProducto("Carne"), 6));

        supermercado.realizarCompra(cliente);
        supermercado.mostrarInventario();

    }
}