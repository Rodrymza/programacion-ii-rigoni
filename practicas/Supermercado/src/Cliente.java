import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Producto> carrito;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrito = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }

    public void agregarProducto(Producto producto) {
        if (producto.getCantidad() > 0) {
            carrito.add(producto);
        }
    }

    public double calcularTotalCompra() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}
