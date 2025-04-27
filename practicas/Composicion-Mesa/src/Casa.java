import java.util.ArrayList;

public class Casa {
    private int numHabitaciones;
    private ArrayList<Puerta> puertas;

    public Casa(int numHabitaciones, String... materialesPuertas) {
        this.numHabitaciones = numHabitaciones;
        this.puertas = new ArrayList<>();

        for (String material : materialesPuertas) {
            this.puertas.add(new Puerta(material));
        }
    }

    public void mostrarCasa(){
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Puertas:");
        for (Puerta puerta : puertas) {
            System.out.println("- Material: " + puerta.getMaterial());
        }
    }
}
