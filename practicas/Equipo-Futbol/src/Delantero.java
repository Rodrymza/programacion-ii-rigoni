public class Delantero extends Jugador{
    private int golesAnotados;

    public Delantero(String nombre, String apellidos, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellidos, edad, esTitular);
        this.golesAnotados = golesAnotados;
    }
    @Override
    public String toString() {
        return "Delantero{" +
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                ", esTitular=" + isEsTitular() +
                ", golesAnotados=" + golesAnotados +
                '}';
    }
}
