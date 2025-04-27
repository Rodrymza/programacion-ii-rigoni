import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Empleado> listaEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (listaEmpleados.contains(empleado)) {
            System.out.println("El empleado ya está en la lista.");
        } else {
            listaEmpleados.add(empleado);
            System.out.println("Empleado agregado al departamento.");
        }
    }
    public void mostrarDepartamento(){
        System.out.println("Nombre del departamento: " + nombre);
        for (Empleado empleado: listaEmpleados) {
            System.out.println(empleado);
        }
        System.out.println("-------------------------");
    }
}
