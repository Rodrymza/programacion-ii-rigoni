import java.util.Scanner;

public class Utilidades {
    public static int pedirnumero(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        String userInput = input.nextLine();
        int number = Integer.parseInt(userInput);
        return number;
    }
    public static void validarPositivo(int numero) {
        String mensaje = (numero >= 0) ? numero + " es positivo" : numero + " es negativo";
        System.out.println(mensaje);
    }
    public static void mayorQueDiez(int numero) {
        String mensaje = (numero >= 10) ? numero + " es mayor o igual a diez" : numero + " es menor a diez";
        System.out.println(mensaje);
    }
}
