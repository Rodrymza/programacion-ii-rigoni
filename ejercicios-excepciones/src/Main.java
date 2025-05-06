import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Manejo de edad
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);
        try {
            persona.setEdad(-1);
        } catch (EdadInvalidaException error) {
            System.out.println("Error: " + error.getMessage());
        }

        //Manejo de errores en division
        CalculadoraDivision division = new CalculadoraDivision();
        try {
            double resultado = division.dividir();
            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Por favor ingrese un número.");
            division.dividir();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            division.dividir();
        }

        //Manejo de errores de formateo de Strings
        String numero = "uno";
        try {
            int resultado = convertirStringAEntero(numero);
            } catch (NumberFormatException error) {
                System.out.println("Error: Valor inválido. No se puede convertir a entero. " + error.getMessage());
            }
        }

    public static int convertirStringAEntero(String numero) throws NumberFormatException {
        return Integer.parseInt(numero);
    }

    public static void leerArchivo(String nombreArchivo) throws FileNotFoundException, IOException {

    }
}

