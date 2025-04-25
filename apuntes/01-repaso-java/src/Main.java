import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                // Mostrar el menú de selección
                System.out.println("\n----- Menú de Ejercicios -----");
                int opcion = Utilidades.pedirnumero("Selecciona un ejercicio - 0 Para salir");

                // Estructura de selección para los ejercicios
                switch (opcion) {
                    case 1 -> Ejercicios.ejercicio01();
                    case 2 -> Ejercicios.ejercicio02();
                    case 3 -> Ejercicios.ejercicio03();
                    case 4 -> Ejercicios.ejercicio04();
                    case 5 -> Ejercicios.ejercicio05();
                    case 6 -> Ejercicios.ejercicio06();
                    case 7 -> Ejercicios.ejercicio07();
                    case 8 -> Ejercicios.ejercicio08();
                    case 9 -> Ejercicios.ejercicio09();
                    case 10 -> Ejercicios.ejercicio10();
                    case 0 -> {
                        System.out.println("Saliendo del programa...");
                        return; // Salir del programa
                    }
                    default -> System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 10 o 0 para salir.");
                }
            }

        }


}
