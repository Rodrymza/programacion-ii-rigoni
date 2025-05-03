package cartas;

import baraja.Palo;

public class CartaFigura extends CartaConPalo{
    private char letra;

    public CartaFigura(Palo palo, char letra) {
        super(palo);
        this.letra = letra;
    }

    @Override
    public String getRepresentacion() {
        return letra  + super.getRepresentacion();
    }
}
