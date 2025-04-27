import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Departamento> listaDepartamentos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaDepartamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public void agregarDepartamento(Departamento departamento) {
        if (listaDepartamentos.contains(departamento)) {
            System.out.println("El departamento ya está en la lista.");
        } else {
            listaDepartamentos.add(departamento);
            System.out.println("Departamento agregado a la empresa.");
        }
    }

    public void eliminarDepartamento(Departamento departamento) {
        if (listaDepartamentos.contains(departamento)) {
            listaDepartamentos.remove(departamento);
            System.out.println("Departamento eliminado de la empresa.");
        } else {
            System.out.println("El departamento no está en la lista.");
        }
    }

    public void mostrarDepartamentos() {
        System.out.println("Lista de departamentos:");
        for (Departamento departamento : listaDepartamentos) {
            departamento.mostrarDepartamento();
        }
    }
}
