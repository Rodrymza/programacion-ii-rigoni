public class Distancia implements Convertible {
    private double metros;

    public Distancia(double metros) {
        this.metros = metros;
    }

    @Override
    public String convertir() {
        double pies = metros * 3.28084;
        double yardas = metros * 1.0936;
        return metros + "m es igual a " + pies + "pies \n y " + yardas + "yardas";
    }
}
