package baraja;

public enum Palo {
    PICA(ColorPalo.NEGRO),
    CORAZON(ColorPalo.ROJO),
    DIAMANTE(ColorPalo.ROJO),
    TREBOL(ColorPalo.NEGRO);

    private final ColorPalo color;

    private Palo(ColorPalo color) {
        this.color = color;
    }

    public ColorPalo getColor() {
        return color;
    }
}
