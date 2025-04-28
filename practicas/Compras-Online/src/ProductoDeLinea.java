public class ProductoDeLinea {
    private int cantidad;
    private float precio;
    private Producto producto;

    public ProductoDeLinea() {
    }

    public String getNombre() {
        return producto.getNombre();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
