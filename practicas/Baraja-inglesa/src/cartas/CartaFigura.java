package cartas;

import baraja.Palo;

public class CartaFigura extends CartaConPalo{
    private char letra;

    public CartaFigura(Palo palo, char letra) {
        super(palo);
        this.letra = letra;
    }

    @Override
    public void mostrar() {
        System.out.println(getPalo() + ": " + letra + " (" + getColor() + ")");
    }
}
