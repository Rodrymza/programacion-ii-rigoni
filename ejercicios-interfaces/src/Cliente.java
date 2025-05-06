public class Cliente implements Imprimible {
    private String nombre;
    private String dni;
    private int edad;

    public Cliente(String nombre, int edad,String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }
}
