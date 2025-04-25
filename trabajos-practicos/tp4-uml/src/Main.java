public class Main {
    public static void main(String[] args) {
        SistemaSoporte sistema = new SistemaSoporte();

        //crear usuario
        Usuario usuario1 = new Usuario(33, "Ruben Gomez", "rgomez@hsacompany.com");

        //Crear tickets con el usuario anteriormente creado
        sistema.crearTicket("Problema de conexion de PC 8", usuario1);
        sistema.crearTicket("Problema con Impresora de Contaduria", usuario1);


        //asignar tecnico a ticket
        Tecnico tecnico1 = new Tecnico(30, "Juan Perez", "Redes");
        Tecnico tecnico2 = new Tecnico(41, "Maria Lopez", "Hardware");

        sistema.asignarTecnico(1, tecnico1);
        sistema.asignarTecnico(2, tecnico2);

        //cerrar ticket
        sistema.cerrarTicket(2);

        //mostrar tickets
        sistema.mostrarTickets();

        //mostrar tickets en proceso
        sistema.mostrarTicketsPendientes();


    }
}