package Clase;

public class Tienda {
    private String nombre;
    private Cliente[] clientes = new Cliente[10];
    private static int cantClientes = 0;


    public void agregarClientes(Cliente cliente) {
        clientes[cantClientes] = cliente;
        cantClientes++;
    }
}
