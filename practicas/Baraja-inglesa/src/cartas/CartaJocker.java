package cartas;

public class CartaJocker extends Carta{
    private boolean aColor;

    public CartaJocker(boolean aColor) {
        this.aColor = aColor;
    }

    @Override
    public void mostrar() {
        String color = (aColor) ? "Con color" : "Sin color";
        System.out.println("Jocker: " + color);
    }
}
