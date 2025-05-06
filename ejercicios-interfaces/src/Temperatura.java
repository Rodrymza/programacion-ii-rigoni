public class Temperatura implements Convertible{
    private double gradosCelsuis;

    public Temperatura(double gradosCelsuis) {
        this.gradosCelsuis = gradosCelsuis;
    }

    @Override
    public String convertir() {
        double gradosFarenheit = (gradosCelsuis * 9/5) + 32;
        double gradosKenvin = gradosCelsuis + 273;
        return gradosCelsuis + "°C es igual a " + gradosFarenheit + "°F\n y " + gradosKenvin + "K";
    }
}
