//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int salarioMinimo = 1500;
        double salarioBasico = 1800;
        double montoCliente = 85;

        Empresa miEmpresa = new Empresa();

        EmpleadoComision empleado1 = new EmpleadoComision("123456", "Perez", "Juan", 2018, salarioMinimo, 25, montoCliente );
        EmpleadoComision empleado2 = new EmpleadoComision("223344", "Suarez", "Viviana", 2020, salarioMinimo, 15, montoCliente );
        EmpleadoSalarioFijo empleado3 = new EmpleadoSalarioFijo("456673", "Morales", "Julian", 2018, salarioBasico);
        EmpleadoSalarioFijo empleado4 = new EmpleadoSalarioFijo("334984", "Rosales", "Laura", 2022, salarioBasico);
        miEmpresa.agregarEmpleado(empleado1);
        miEmpresa.agregarEmpleado(empleado2);
        miEmpresa.agregarEmpleado(empleado3);
        miEmpresa.agregarEmpleado(empleado4);

        miEmpresa.mostrarSalarios();
        Empleado empleadoMasClientes = miEmpresa.empleadoConMasClientes();
        System.out.println("El empleado con mas clientes captados es:");
        empleadoMasClientes.mostrarEmpleado();
    }
}