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
    public void agregarPersona(Persona persona) {
        personas.add(persona);
        persona.agregarLibro(this);
    }
}
