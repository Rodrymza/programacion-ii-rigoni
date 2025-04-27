import java.lang.reflect.Array;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String cuit;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.departamentos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = new ArrayList<>(departamentos);
    }

    public void agregarDepartamento(Departamento departamento) {
        if (departamentos.contains(departamento)) {
            System.out.println("El departamento ya existe en la empresa.");
            return;
        } else {
            departamentos.add(departamento);
            System.out.println("Departamento agregado: " + departamento.getNombre());
            departamento.setEmpresa(this);
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleados.contains(empleado)) {
            System.out.println("El empleado ya existe en la empresa.");
            return;
        } else {
            empleados.add(empleado);
            System.out.println("Empleado agregado: " + empleado.getNombre());
            empleado.setEmpresa(this);
        }
    }

    public void mostrarEstructura() {
        for (Departamento departamento : departamentos) {
            departamento.mostrarDepartamento();
        }
    }
}
