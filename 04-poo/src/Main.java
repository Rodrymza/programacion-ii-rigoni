public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado(36499229, "Ramirez Rodrigo", "Desarrollador", 800.0);
        empleados[1] = new Empleado("Perez Juan", "Analista");
        empleados[2] = new Empleado(3455723, "Suarez Marisa", "Analista", 900.0);

        //actualizar salarios
        empleados[0].actualizarSalario(15);
        empleados[1].actualizarSalario(980.0);

        //mostrar empleados
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        //total empleados
        System.out.println("Total de empleados: " + Empleado.getTotalEmmpleados());
    }

}