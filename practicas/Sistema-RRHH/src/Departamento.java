import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Oficina> oficinas;
    private Empresa empresa;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.oficinas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = new ArrayList<>(empleados);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void agregarOficina(int numero, int piso) {
        Oficina oficina = new Oficina(numero, piso);
        oficinas.add(oficina);
        oficina.setDepartamento(this);
        System.out.println("Oficina agregada: " + oficina.getNumero() + " en el piso " + oficina.getPiso());
    }

    public boolean agregarEmpleado(Empleado empleado) {
        if (empleado != null && !empleados.contains(empleado)) {
            empleado.setDepartamento(this);
            empleado.setEmpresa(empresa);
            empleados.add(empleado);
            System.out.println("Empleado " + empleado.getNombre() + " agregado a " + nombre);
            return true;
        }
        System.out.println("No se pudo agregar el empleado al departamento");
        return false;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void mostrarDepartamento() {
        System.out.println("Departamento: " + nombre);
        for (Oficina oficina : oficinas) {
            oficina.mostrarOficina();
        }
        System.out.println("Lista de Empleados:");
        for (Empleado empleado: empleados) {
            System.out.println(empleado.getLegajo() + "-" + empleado.getNombre());
        }
        System.out.println("--------------------------------------");
    }

    public void transferirEmpleado(Empleado empleado, Departamento nuevoDepartamento) {
        if (empleado!= null && !empleados.contains(empleado)) {
            empleados.remove(empleado);
            System.out.println("Empleado " + empleado.getNombre() + "eliminado de " + nombre);
            if (nuevoDepartamento.agregarEmpleado(empleado)) {
                empleado.setDepartamento(nuevoDepartamento);
            } else {
                //volvemos a agregar el empleado eliminado si no lo pudimos agregar, para evitar que se pierda
                empleados.add(empleado);
            }
        } else {
            System.out.println("No se pudo realizar la transferencia del empleado");
        }
    }
}
