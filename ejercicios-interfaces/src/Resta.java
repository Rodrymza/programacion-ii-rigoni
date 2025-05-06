public class Resta implements Operaciones{
    public Resta() {
    }

    @Override
    public double operar(double a, double b) {
        return a - b;
    }

    @Override
    public void mostrarInfo() {
        Operaciones.super.mostrarInfo();
        System.out.println("Esto es una resta");
    }
}
