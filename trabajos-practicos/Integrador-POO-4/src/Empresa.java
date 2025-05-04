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
        Empleado empleado = null;

        return empleado;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null && !empleados.contains(empleado)) {
            this.empleados.add(empleado);
        } else {
            System.out.println("No se agrego el empleado");
        }
    }
}
