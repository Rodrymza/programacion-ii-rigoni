public class Main {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa("Mi empresa", "33-34565498-8");
        Departamento recursos = new Departamento("Recursos Humanos");
        recursos.agregarOficina(1,2);
        recursos.agregarOficina(3,2);
        miEmpresa.agregarDepartamento(recursos);
        Departamento desarrollo = new Departamento("Desarrollo");
        desarrollo.agregarOficina(1,2);
        desarrollo.agregarOficina(1,4);
        miEmpresa.agregarDepartamento(desarrollo);
        Empleado empleado1 = new Empleado("Garia Rodrigo", "23344344", 40, TipoContrato.TIEMPO_COMPLETO);
        Empleado empleado2 = new Empleado("Perez Juan", "34533455", 32, TipoContrato.TIEMPO_COMPLETO);

        desarrollo.agregarEmpleado(empleado1);
        recursos.agregarEmpleado(empleado2);

        miEmpresa.mostrarEstructura();

        System.out.println(empleado1);
    }
}