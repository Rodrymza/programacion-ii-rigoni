import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Manejo de edad
    public static void main(String[] args) {
        //Validar edad
        validarEdadPersona();

        //ValidarDivision
        validarDivision();

        //Convertir string a entero
        convertirStringEntero();

        //leer archivo con manejo de excepciones
        leerArchivo("src/saludo.txt");
        leerArchivo("ruta-invalida");

    }

    public static void validarEdadPersona() {
        Persona persona = new Persona("Juan", 25);
        try {
            persona.setEdad(-1);
        } catch (EdadInvalidaException error) {
            System.out.println("Error: " + error.getMessage());
        }
    }

    public static void validarDivision() {
        System.out.println("Clase calculadora: Manejor de AritmetichException y MismatchException");
        CalculadoraDivision division = new CalculadoraDivision();
        try {
            double resultado = division.dividir();
            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Por favor ingrese un número.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void convertirStringEntero() {
        //Manejo de errores de formateo de Strings
        ConversorAEntero convertir = new ConversorAEntero();
        System.out.println("Manejo formateo de Strings");
        String numero = "uno";
        try {
            int resultado = convertir.convertirAEntero(numero);
        } catch (NumberFormatException error) {

        }
        System.out.println("No ingresaste un numero entero válido");
    }

    public static void leerArchivo(String rutaArchivo){
        LectorArchivo reader = new LectorArchivo();
        try {
        reader.leerArchivo(rutaArchivo);
        } catch (FileNotFoundException error) {
            System.out.println("No se encontró el archivo especificado");
        } catch (IOException error) {
            System.out.println("Ocurrio un error inesperado de E/S");
        }
    }
}