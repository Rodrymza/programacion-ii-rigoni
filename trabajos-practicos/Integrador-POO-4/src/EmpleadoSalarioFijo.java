import java.util.Date;

public class EmpleadoSalarioFijo extends Empleado {
    private double salarioBasico;
    private double PORC1 = 0.05;
    private double PORC2 = 0.01;
    private int ANIOS1 = 2;
    private int ANIOS2 = 5;

    public EmpleadoSalarioFijo(String dni, String apellido, String nombre, int anioIngreso, double salarioBasico) {
        super(dni, apellido, nombre, anioIngreso);
        this.salarioBasico = salarioBasico;
    }

    @Override
    public double calcularSalario() {
        double salarioFinal = salarioBasico + (salarioBasico * getPorcAdicional());
        return salarioFinal;
    }

    private double getPorcAdicional(){
        double porcentaje = 0;
        int antiguedad = calcularAntiguedad();
        if (antiguedad >  ANIOS2) {
            porcentaje = PORC2;
        } else if (antiguedad >= ANIOS1) {
            porcentaje = PORC1;
        }
        return porcentaje;
    }
}
