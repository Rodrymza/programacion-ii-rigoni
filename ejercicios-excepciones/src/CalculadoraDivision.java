import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDivision {
    public CalculadoraDivision() {
    }

    private int pedirEntero(String mensaje) throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        int numero = input.nextInt();
        return numero;
    }

    public double dividir() throws InputMismatchException, ArithmeticException {
        int numerador = pedirEntero("Ingrese el numerador: ");
        int denominador = pedirEntero("Ingrese el denominador: ");
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) numerador / denominador;
    }
}

