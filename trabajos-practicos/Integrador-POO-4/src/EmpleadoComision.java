public class EmpleadoComision extends Empleado{
    private double salarioMinimo;
    private int cantidadClientes;
    private double montoCliente;

    public EmpleadoComision(String dni, String apellido, String nombre, int anioIngreso, double salarioMinimo, int cantidadClientes, double montoCliente) {
        super(dni, apellido, nombre, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantidadClientes = cantidadClientes;
        this.montoCliente = montoCliente;
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }

    @Override
    public double calcularSalario() {
        double salario = cantidadClientes * montoCliente;
        return (salario > salarioMinimo) ? salario : salarioMinimo;
    }

}
