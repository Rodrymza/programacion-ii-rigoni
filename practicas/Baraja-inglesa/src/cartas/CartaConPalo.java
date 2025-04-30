package cartas;
import baraja.ColorPalo;
import baraja.Palo;


public abstract class CartaConPalo extends Carta {
    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

    public Palo getPalo() {
        return palo;
    }

    public ColorPalo getColor() {
        return getPalo().getColor();
    }
}
