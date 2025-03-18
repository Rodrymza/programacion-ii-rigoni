import ejercicio01.Estudiante;
import ejercicio03.Libro;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ramirez", "Rodrigo", "1", 5);
        estudiante1.mostrarInfo();


        Libro libro1 = new Libro("Holly", "Stephen King", 2023);
        libro1.setAnioPublicacion(2026);
        libro1.setAnioPublicacion(2022);

    }
}

