package Clase;

public class Main {
    public static void main(String[] args) {
        Silla silla = new Silla();

        silla.agregarPatas("Madera", "Rojo");

        Factura factura = new Factura(1001, 2500.50);
        double total = factura.calcularTotal();
        System.out.println(total);
    }


}
