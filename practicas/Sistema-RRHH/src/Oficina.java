public class Oficina {
    private int numero;
    private int piso;
    private Departamento departamento;

    public Oficina(int numero, int piso) {
        this.numero = numero;
        this.piso = piso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "numero=" + numero +
                ", piso=" + piso +
                '}';
    }

    public void mostrarOficina() {
        System.out.println("Oficina: " + numero + " en el piso " + piso);
    }
}
