import java.util.ArrayList;

public class Cine {
    private String nombre;
    private String direccion;
    private ArrayList<SalaVIP> salasvip;
    private ArrayList<Sala> salas;
    private ArrayList<Compra> compras;
    private ArrayList<Venta> ventas;
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Empleado> empleados;


    public Cine() {
        this.salas = new ArrayList<>();
        this.compras = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.salasvip = new ArrayList<>();
        this.peliculas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void registrarCompra(Compra compra) {
        compras.add(compra);
        System.out.println("Compra registrada satisfactoriamente");
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
        System.out.println("Venta registrada satisfactoriamente");
    }

    public void agregarSala(Sala sala) {
        this.salas.add(sala);
        System.out.println("Sala " + sala.getNumero() + " agregada al cine");
    }

    public void agregarSalaVip(SalaVIP sala) {
        this.salasvip.add(sala);
        System.out.println("Sala VIP " + sala.getNumero() + " agregada al cine");
    }

    public void agregarPelicula(String titulo, Genero genero){
        Pelicula pelicula = new Pelicula();
        pelicula.setGenero(genero);
        pelicula.setTitulo(titulo);
        peliculas.add(pelicula);
        System.out.println("Pelicula " + pelicula.getTitulo() + " agregada al cine");

    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado " + empleado.getNombre() + " agregado al cine");
    }

}
