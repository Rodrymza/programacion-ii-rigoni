package baraja;

import cartas.Carta;
import cartas.CartaFigura;
import cartas.CartaJocker;
import cartas.CartaNumeral;

import java.util.ArrayList;

public class BarajaInglesa {
    private ArrayList<Carta> cartas;

    public BarajaInglesa() {
        this.cartas = new ArrayList<>();
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            carta.mostrar();
        }
    }

    public void generarCartas() {
        generarCartasNumerales();
        generarCartasFiguras();
        generarCartasJockers();
    }

    private void generarCartasNumerales() {
        final int MIN = 2;
        final int MAX = 10;
        Palo[] palos = Palo.values();
        for (Palo palo : palos) {
            for (int i = MIN; i <= MAX; i++) {
                this.cartas.add(new CartaNumeral(palo, i));
            }
        }
    }

    private void generarCartasFiguras() {
        char[] figuras = {'A', 'J', 'Q', 'K'};
        Palo[] palos = Palo.values();

        for (Palo palo : palos) {
            for (char letra : figuras) {
                this.cartas.add(new CartaFigura(palo, letra));
            }
        }
    }

    private void generarCartasJockers() {
        this.cartas.add(new CartaJocker(true));
        this.cartas.add(new CartaJocker(false));
    }

}



