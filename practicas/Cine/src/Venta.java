import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private Date fecha;
    private Pago pago;
    private ArrayList<Funcion> funciones;
    private ArrayList<Cliente> clientes;

    public Venta() {
        this.funciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void agregarPago(Pago pago) {
        this.pago = pago;
        System.out.println("Pago agregado");
    }

    public void agregarFuncion(Funcion funcion) {
        funciones.add(funcion);
        System.out.println("Funcion a las " + funcion.getHorario() + " agregada a la venta");
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
        System.out.println("Cliente " + cliente.getNombre() + " agregado a la venta");
    }
}
