public class Tiempo implements Convertible{
    private double segundos;

    public Tiempo(double segundos) {
        this.segundos = segundos;
    }

    @Override
    public String convertir() {
        double minutos = segundos /60;
        double horas = segundos / 3600;
        return segundos + " segundos son " + minutos + " minutos \n y " + horas + " horas";
    }
}
