package ejercicio03;


import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public Libro() {}

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion >=1900 && anioPublicacion <= LocalDate.now().getYear()) {
            this.anioPublicacion = anioPublicacion;
            System.out.println("Año de publicacion de " + this.titulo + " modificado:" + this.anioPublicacion);
        } else {
            System.out.println("El año de publicacion no puede ser menor a 1900 ni mayor a " + LocalDate.now().getYear() + "");
        }
    }

}
