import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private Genero genero;
    private ArrayList<Funcion> funciones;

    public Pelicula() {
        this.funciones = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
