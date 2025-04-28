import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    private String id;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private UsuarioWeb usuario;
    private ArrayList<Cuenta> cuentas;
    private CarritoDeCompra carritoDeCompra;

    public Cliente(){
        this.cuentas = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public UsuarioWeb getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioWeb usuario) {
        this.usuario = usuario;
    }

    public void agregarCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
        System.out.println("Cuenta agregada al cliente");
    }

    public CarritoDeCompra getCarritoDeCompra() {
        return carritoDeCompra;
    }

    public void setCarritoDeCompra(CarritoDeCompra carritoDeCompra) {
        this.carritoDeCompra = carritoDeCompra;
    }

}
