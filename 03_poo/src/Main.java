import ejercicio01.Estudiante;
import ejercicio02.Mascota;
import ejercicio03.Libro;
import ejercicio04.Gallina;
import ejercicio05.NaveEspacial;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        System.out.println("--------------------Ejercicio 1---------------------");
        Estudiante estudiante1 = new Estudiante("Ramirez", "Rodrigo", "Programacion 2", 8);
        estudiante1.mostrarInfo();

        //Ejercicio 2
        System.out.println("--------------------Ejercicio 2---------------------");
        Mascota firulais = new Mascota("Firulais", "Perro", 5);
        firulais.mostrarInfo();
        firulais.cumplirAnios();
        firulais.mostrarInfo();

        //Ejercicio 3
        System.out.println("--------------------Ejercicio 3---------------------");
        Libro libro1 = new Libro("Holly", "Stephen King", 2023);
        libro1.setAnioPublicacion(2026);
        libro1.setAnioPublicacion(2022);
        System.out.println("Informacion del libro: \n" +
                "Titulo: " + libro1.getTitulo() + "\n" +
                "Autor: " + libro1.getAutor() + "\n" +
                "Año de publicacion: " + libro1.getAnioPublicacion());

        //Ejercicio 4
        System.out.println("--------------------Ejercicio 4---------------------");
        Gallina gallinaUno = new Gallina(1,2,400);
        Gallina gallinaDos = new Gallina(2, 3, 650);

        gallinaUno.mostrarEstado();
        gallinaDos.mostrarEstado();

        gallinaUno.ponerHuevo(50);
        gallinaUno.envejecer();
        gallinaUno.mostrarEstado();

        gallinaDos.ponerHuevo(35);
        gallinaDos.envejecer();
        gallinaDos.mostrarEstado();

        //Ejercicio 5
        System.out.println("--------------------Ejercicio 5---------------------");
        NaveEspacial nave = new NaveEspacial("Interestelar", 50);
        nave.avanzar(60);
        nave.recargarCombustible(40);
        nave.avanzar(60);
        nave.mostrarEstado();


    }
}

