//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crear un cliente
        Cliente cliente = new Cliente("Rodrigo", 33, "12345678");
        Producto producto = new Producto("123431", "Cerveza", 3000);

        cliente.imprimir();
        producto.imprimir();
        Operaciones.mostrarMensaje("Hola mundo");
    }
}