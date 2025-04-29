import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    private String titulo;
    private int anio;
    private ArrayList<Ejemplar> ejemplares;
    private Genero genero;

    public Publicacion(String titulo, int anio, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.ejemplares = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(ArrayList<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ArrayList<Ejemplar> getEjemplaresDisponibles() {
        ArrayList<Ejemplar> ejemplaresDisponibles = new ArrayList<>();
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar.estaDisponible()) {
                ejemplaresDisponibles.add(ejemplar);
            }
        }
        return ejemplaresDisponibles;
    }

    public void agregarEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
        System.out.println("Ejemplar agregado: " + ejemplar.getCodigo());
    }

    public void mostrarEjemplaresDisponibles() {
        for (Ejemplar ejemplar : getEjemplaresDisponibles()) {
            ejemplar.mostrarEjemplar();
        }
    }

    public void mostrarEjemplares() {
        for (Ejemplar ejemplar : ejemplares) {
            ejemplar.mostrarEjemplar();
        }
    }

}




