public class Tecnico extends Persona{
    private int aniosExperiencia;

    public Tecnico(String nombre, String apellidos, int edad, int aniosExperiencia) {
        super(nombre, apellidos, edad);
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                ", aniosExperiencia=" + aniosExperiencia +
                '}';
    }
}
