public class Portero extends Jugador {
    private int golesRecibidos;

    public Portero(String nombre, String apellidos, int edad, boolean esTitular, int golesRecibidos) {
        super(nombre, apellidos, edad, esTitular);
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public String toString() {
        return "Portero{" +
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                ", esTitular=" + isEsTitular() +
                ", golesRecibidos=" + golesRecibidos +
                '}';
    }
}
