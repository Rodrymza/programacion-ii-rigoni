package cartas;

public abstract class Carta {
    private boolean tapada;

    public Carta() {}

    @Override
    public String toString() {
        return "cartas.Carta{" +
                "tapada=" + tapada +
                '}';
    }

    public void darVuelta() {
        this.tapada = false;
    }

    public abstract void mostrar();
}
