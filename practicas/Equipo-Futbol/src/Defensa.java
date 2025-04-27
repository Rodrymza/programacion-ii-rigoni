public class Defensa extends Jugador{

    public Defensa(String nombre, String apellidos, int edad, boolean esTitular) {
        super(nombre, apellidos, edad, esTitular);
    }
    @Override
    public String toString(){
        return "Defensa{" +
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                ", esTitular=" + isEsTitular() +
                '}';
    }
}
