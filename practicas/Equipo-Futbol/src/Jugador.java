public class Jugador extends Persona{
    private boolean esTitular;

    public Jugador(String nombre, String apellidos, int edad, boolean esTitular) {
        super(nombre, apellidos, edad);
        this.esTitular = esTitular;
    }

    public String isEsTitular() {
        return esTitular? "Titular" : "Suplente";
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }
}
