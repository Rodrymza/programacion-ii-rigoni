import java.util.ArrayList;

public class Persona {
    private String apellido;
    private String nombre;
    private String dni;
    private ArrayList<Libro> libros;

    public Persona(String apellido, String nombre, String dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.libros = new ArrayList<>();
    }

        public void agregarLibro(Libro libro) {
            libros.add(libro);
            libro.agregarPersona(this);
    }

}
