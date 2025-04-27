public class Mediocampo extends Jugador {
    private int numeroAsistencias;

    public Mediocampo(String nombre, String apellidos, int edad, int numeroAsistencias) {
        super(nombre, apellidos, edad, true);
        this.numeroAsistencias = numeroAsistencias;
    }

    @Override
    public String toString() {
        return "Mediocampo{" +
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                ", esTitular=" + isEsTitular() +
                ", numeroAsistencias=" + numeroAsistencias +
                '}';
    }
}
