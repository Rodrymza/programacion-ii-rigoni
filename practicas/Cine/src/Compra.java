import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private Date fecha;
    private ArrayList<Insumo> insumos;
    private ArrayList<Proveedor> proovedores;

    public Compra() {
        this.fecha = new Date();
        this.insumos = new ArrayList<>();
        this.proovedores = new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void agregarInsumo(String nombre, double precio){
        Insumo insumo = new Insumo();
        insumo.setPrecio(precio);
        insumo.setNombre(nombre);
        insumos.add(insumo);
        System.out.println("Insumo " + insumo.getNombre() + " agregado a la compra");
    }

    public void agregarProveedor(Proveedor proveedor) {
        this.proovedores.add(proveedor);
        System.out.println("Proveedor " + proveedor.getNombre() + " agregado a la compra");
    }
}


