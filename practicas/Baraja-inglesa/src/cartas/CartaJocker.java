package cartas;

public class CartaJocker extends Carta{
    private boolean aColor;

    public CartaJocker(boolean aColor) {
        this.aColor = aColor;
    }

    @Override
    public String getRepresentacion() {
        return ("Jocker " + (aColor ? "a colores" : "blanco y negro"));
    }
}
