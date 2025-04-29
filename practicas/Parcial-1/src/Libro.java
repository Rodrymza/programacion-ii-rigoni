import java.util.ArrayList;

public class Libro extends Publicacion {
    private String isbn;
    private ArrayList<Autor> autores;
    private Editorial editorial;

    public Libro(String titulo, int anio, Genero genero, Editorial editorial, ArrayList<Autor> autores) {
        super(titulo, anio, genero);
        this.editorial = editorial;
        this.autores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
}
