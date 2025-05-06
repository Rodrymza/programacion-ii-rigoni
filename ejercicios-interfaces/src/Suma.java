public class Suma implements Operaciones{

    public Suma() {
    }

    @Override
    public double operar(double a, double b) {
        return a + b;
    }

    @Override
    public void mostrarInfo() {
        Operaciones.super.mostrarInfo();
        System.out.println("Esto es una suma");
    }
}
