import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDivision {
    public CalculadoraDivision() {
    }

    public double dividir() throws InputMismatchException, ArithmeticException {
        Scanner input = new Scanner(System.in);
        double numerador = 0;
        double denominador = 0;

        System.out.println("Igrese el numerador: ");
        numerador = input.nextDouble();
        System.out.println("Ingrese el denominador: ");
        denominador = input.nextDouble();
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }

        return numerador / denominador;
    }
}
