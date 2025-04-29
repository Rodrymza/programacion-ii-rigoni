import java.util.ArrayList;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //crea instancia de genero y autores
        Genero cienciaFiccion = new Genero("Ciencia Ficción");
        Autor autor1 = new Autor("Autor 1", "Estadounidense", new Date(1990, 1, 1));
        Autor autor2 = new Autor("Autor 2", "Britanico", new Date(1985, 5, 15));

        //agregoa autores a lista
        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);

        //creo direccion y editorial
        Direccion direccionEditorial = new Direccion("Cale Falsa", 123, "Mendoza", "5501");
        Editorial editorial1 = new Editorial("Editorial 1", direccionEditorial);

        //creo isntancia de libro con objetos ya creados
        Libro libro1 = new Libro("Libro Ciencia Ficcion", 2020, cienciaFiccion, editorial1, autores);
        Ejemplar ejemplar1 = new Ejemplar("123456", EstadoEjemplar.DISPONIBLE, libro1);
        Ejemplar ejemplar2 = new Ejemplar("654321", EstadoEjemplar.RETRASADO, libro1);

        //agrego ejemplares a libro
        libro1.agregarEjemplar(ejemplar1);
        libro1.agregarEjemplar(ejemplar2);

        //creo genero para revista
        Genero economia = new Genero("Economía");
        Revista revista1 = new Revista("Economia global", 2024, economia, 1, 23);
        Ejemplar ejemplar3 = new Ejemplar("789012", EstadoEjemplar.DISPONIBLE, revista1);
        revista1.agregarEjemplar(ejemplar3);

        //Instanciar Biblioteca, agrego usuario y publicaciones
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarPublicacion(libro1);
        biblioteca.agregarPublicacion(revista1);
        Usuario usuario1 = new Usuario("Rodrigo", "Ramirez", "12333455");
        biblioteca.agregarUsuario(usuario1);

        //creo instancia de prestamo con ejemplar y la asigno al usuario
        Prestamo prestamo = new Prestamo(new Date());
        prestamo.agregarLineaPrestamo(ejemplar1);
        usuario1.agregarPrestamo(prestamo);

        //implementar metodo estaDisponible en ejemplar
        System.out.println("Ejemplar 1 disponible: " + ejemplar1.estaDisponible());
        System.out.println("Ejemplar 2 disponible: " + ejemplar2.estaDisponible());

        //implementa metodo getEjemplaresDisponibles en publicacion
        ArrayList<Ejemplar> ejemplaresDisponibles= libro1.getEjemplaresDisponibles();
        for (Ejemplar ejemplar : ejemplaresDisponibles) {
            System.out.println("Ejemplar disponible: " + ejemplar.getCodigo());
        }

        //mostrar historial de prestamos

        usuario1.mostrarHistorialPrestamos();

        //agregar nueva linea de prestamo
       prestamo.agregarLineaPrestamo(ejemplar3);

        System.out.println("Prestamos luego de agregar linea de prestamo");
        usuario1.mostrarHistorialPrestamos();

        System.out.println("Ejemplares disponibles en la biblioteca:");
        biblioteca.mostrarPublicacionesDisponibles();

        System.out.println("Todos los ejemplares en la biblioteca:");
        biblioteca.mostrarEjemplares();



    }
}