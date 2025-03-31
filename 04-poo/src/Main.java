public class Main {
    public static void main(String[] args) {
        Empleado rodry = new Empleado(36499229, "Ramirez Rodrigo", "Desarrollador", 800.0);
        Empleado nuevoEmpleado = new Empleado("Perez Juan", "Analista");

        System.out.println(rodry);
        System.out.println(nuevoEmpleado);
        System.out.println("Total de empleados: " + Empleado.getTotalEmmpleados());
    }

}