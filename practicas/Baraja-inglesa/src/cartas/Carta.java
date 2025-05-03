package cartas;

public abstract class Carta {
    private boolean tapada;

    public Carta() {
        this.tapada = false;
    }

    @Override
    public String toString() {
        return "cartas.Carta{" +
                "tapada=" + tapada +
                '}';
    }

    public void darVuelta() {
        this.tapada = false;
    }

    public void mostrar(){
        if (tapada) {
            System.out.println("******************");
        } else {
            System.out.println(getRepresentacion());
        }
    };

    public abstract String getRepresentacion();
}
