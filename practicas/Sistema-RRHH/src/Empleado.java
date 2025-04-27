import java.util.Objects;

public class Empleado extends Persona {
    private int legajo;
    private TipoContrato tipoContrato;
    private Empresa empresa;
    private Departamento departamento;

    public Empleado(String nombre, String dni, int legajo, TipoContrato tipoContrato) {
        super(nombre, dni);
        this.legajo = legajo;
        this.tipoContrato = tipoContrato;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void cambiarTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
        System.out.println("Se cambio el tipo de contrato a " + tipoContrato);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return legajo == empleado.getLegajo() &&
                getNombre().equals(empleado.getNombre()) &&
                getDni().equals(empleado.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(legajo, getNombre(), getDni());
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "legajo=" + legajo +
                ", tipoContrato=" + tipoContrato +
                ", empresa=" + empresa.getNombre() +
                ", departamento=" + departamento.getNombre() +
                '}';
    }

    public void mostrarTipoContrato() {
        tipoContrato.mostrarTipoContrato();
    }
}
