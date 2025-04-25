package Clase;

public class Factura {
    private int numero;
    private double monto;

    public Factura(int numero, double monto) {
        this.numero = numero;
        this.monto = monto;
    }

    public double calcularTotal(){
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();
        double iva = calculadora.calcularIva(monto);
        return monto+iva;
    }

    public double getMonto() {
        return monto;
    }

}
