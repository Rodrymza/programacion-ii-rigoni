import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Lionel", "Messi", "Delantero");
        Jugador jugador2 = new Jugador("Cristiano", "Ronaldo", "Delantero");
        Jugador jugador3 = new Jugador("Xavi", "Hernandez", "Centrocampista");
        Jugador jugador4 = new Jugador("Andres", "Iniesta", "Centrocampista");

        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);
        listaJugadores.add(jugador3);
        listaJugadores.add(jugador4);

        EquipoFutbol equipo1 = new EquipoFutbol("FC Barcelona", listaJugadores);

        for (Jugador jugador : equipo1) {
            System.out.println(jugador);
        }

    }


}