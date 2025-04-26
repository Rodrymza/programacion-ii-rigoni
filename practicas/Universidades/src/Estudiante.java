public class Estudiante {
    private String nombre;
    private int edad;
    private Universidad universidad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void asignarUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
