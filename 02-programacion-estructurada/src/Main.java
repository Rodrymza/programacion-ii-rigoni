import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();
        ejercicio10();
    }
        //Ejercicio 9
    public static void ejercicio08() {
        Ejercicios ejercicios = new Ejercicios();
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precio = input.nextDouble();
        System.out.println("Ingrese el impuesto del producto");
        double impuesto = input.nextDouble();
        System.out.println("Ingrese el descuento del producto");
        double descuento = input.nextDouble();
        ejercicios.calcularPrecioFinal(precio, impuesto, descuento);
    }
        //Ejercicio 10
    public static void ejercicio09() {
        Scanner input = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        System.out.println("Ingrese el precio del producto");
        String ingreso = input.nextLine();
        double precio = Double.parseDouble(ingreso);

        System.out.println("Ingrese el peso del producto");
        ingreso = input.nextLine();
        double peso = Double.parseDouble(ingreso);
        String zona;
        do {
            System.out.println("Seleccione zona de envio:\n" +
                    "1. Nacional\n" +
                    "2. Internacional");
            zona = input.nextLine();
            if (!zona.equals("1") && !zona.equals("2")) {
                System.out.println("Seleccion incorrecta, intente nuevamente");
            }
        } while (!zona.equals("1") && !zona.equals("2"));
        switch (zona) {
            case "1":
                zona = "Nacional";
                break;
            case "2":
                zona = "Internacional";
                break;
        }
        double costoTotal = ejercicios.calcularTotalCompra(precio, ejercicios.calcularCostoEnvio(peso, zona));
    }

    public static void ejercicio10 () {
        Scanner input = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        String ingreso;

        System.out.println("Ingrese el stock actual");
        int stock = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad vendida");
        int cantidadVendida = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad recibida");
        int cantidadRecibida = Integer.parseInt(input.nextLine());

        int stockFinal = ejercicios.actualizarStock(stock, cantidadVendida, cantidadRecibida);
    }

}
