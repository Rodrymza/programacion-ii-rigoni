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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void agregarLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
            libro.agregarPersona(this);
        } else {
            System.out.println("La persona ya está asociada a este libro.");

        }
    }

    public void mostrarLibros(){
        System.out.println("Libros asociados a la persona " + nombre + " " + apellido + ":");
        for (Libro libro : libros) {
            System.out.println("- " + libro.getTitulo() + " de " + libro.getAutor());
        }
    }

}
