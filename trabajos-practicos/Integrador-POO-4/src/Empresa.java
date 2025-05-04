import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }


    public void mostrarSalarios() {
        for (Empleado empleado : empleados) {
            empleado.mostrarEmpleado();
        }
    }

    public Empleado empleadoConMasClientes() {
        Empleado empleadoMasClientes = null;
        int maxClientes = -1;
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoComision) {
                EmpleadoComision empComisionActual = (EmpleadoComision) empleado;
                int cantidad = empComisionActual.getCantidadClientes();
                if (cantidad > maxClientes){
                    empleadoMasClientes = empComisionActual;
                    maxClientes = cantidad;
                }
            }
        }
        return empleadoMasClientes;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null && !empleados.contains(empleado)) {
            this.empleados.add(empleado);
        } else {
            System.out.println("No se agrego el empleado");
        }
    }
}
