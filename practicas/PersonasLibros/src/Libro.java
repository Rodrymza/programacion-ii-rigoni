import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private ArrayList<Persona> personas;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.personas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void agregarPersona(Persona persona) {
        if (!personas.contains(persona)) {
            personas.add(persona);
            persona.agregarLibro(this);
        } else {
            System.out.println("La persona ya está asociada a este libro.");
        }
    }

    public void mostrarPersonas() {
        System.out.println("Personas asociadas al libro " + titulo + ":");
        for (Persona persona : personas) {
            System.out.println("- " + persona.getNombre() + " " + persona.getApellido());
        }
    }
}
