public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Mi Empresa");
        Departamento departamento1 = new Departamento("Recursos Humanos");
        Departamento departamento2 = new Departamento("Desarrollo");

        Empleado empleado1 = new Empleado("Juan Perez", "12345678A", "Gerente");
        Empleado empleado2 = new Empleado("Maria Lopez", "87654321B", "Desarrollador");
        Empleado empleado3 = new Empleado("Ana Garcia", "11223344C", "Analista");

        // Agregar departamentos a la empresa
        empresa.agregarDepartamento(departamento1);
        empresa.agregarDepartamento(departamento2);

        // Agregar empleados a los departamentos
        departamento1.agregarEmpleado(empleado1);
        departamento2.agregarEmpleado(empleado3);
        departamento2.agregarEmpleado(empleado2);

        empresa.mostrarDepartamentos();

    }
}