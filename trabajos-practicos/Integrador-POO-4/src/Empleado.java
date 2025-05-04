import java.util.Date;

public abstract class Empleado {

    private String dni;
    private String apellido;
    private String nombre;
    private int anioIngreso;

    public Empleado(String dni, String apellido, String nombre, int anioIngreso) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.anioIngreso = anioIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public abstract double calcularSalario();

    public void mostrarEmpleado(){
        System.out.println("Apellido y Nombre: " + apellido + ", " + nombre + " Salario $" + calcularSalario());
    };

    public int calcularAntiguedad(){
        int anioActual = new Date().getYear();
        return anioActual - anioIngreso;
    }
}
