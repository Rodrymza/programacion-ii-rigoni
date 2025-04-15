import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class EquipoFutbol implements Iterable<Jugador> {
    private String nombre;
    private List<Jugador> jugadores = new ArrayList<>();

    public EquipoFutbol(String nombre, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public Iterator<Jugador> iterator() {   // devuelve un iterador
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Jugador> {
        private int index = 0;

        @Override
        public boolean hasNext() {      //devuelve true si hay un siguiente elemento
            return index < jugadores.size();
        }

        @Override
        public Jugador next() { // devuelve el siguiente elemento
            return jugadores.get(index++);
        }
    }
}
