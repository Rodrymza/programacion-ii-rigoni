import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contenedor<String> stringContenedor = new Contenedor("Rodrigo");
        System.out.println("Contenedor String: " + stringContenedor);

        Contenedor<Integer> integerContenedor = new Contenedor(2134);
        System.out.println("Contenedor Integer: " + integerContenedor);

        List<String> nombres = new ArrayList<>();
        nombres.add("Rodrigo");
        nombres.add("Clara");
        nombres.add("Juan");

        List<Integer> edades = new ArrayList<>();
        edades.add(33);
        edades.add(5);
        edades.add(8);

        //nombres.forEach(nombre -> System.out.println("Nombre: " + nombre));
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        for (Integer edad : edades) {
            System.out.println("Edad: " + edad);
        }
    }
}