import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets = new ArrayList<>();

    public SistemaSoporte(List<TicketSoporte> tickets) {
        this.tickets = tickets;
    }

    public SistemaSoporte() {
    }

    public void crearTicket(String descripcion, Usuario usuario) {
        TicketSoporte ticket = new TicketSoporte(descripcion, usuario);
        System.out.println("Ticket creado: " + ticket);
        tickets.add(ticket);
    }

    public void crearTicket(String descripcion) {
        TicketSoporte ticket = new TicketSoporte(descripcion);
        this.agregarTicket(ticket);
    }


    public void agregarTicket(TicketSoporte ticket) {
        System.out.println("Ticket agregado: " + ticket);
        tickets.add(ticket);
    }

    public List<TicketSoporte> getTickets() {
        return tickets;
    }

    public void mostrarTickets() {
        System.out.println("Tickets en el sistema:");
        for (TicketSoporte ticket : tickets) {
            System.out.println(ticket.mostrarDetalle());
        }
    }

    public void mostrarTicketsPendientes() {
        System.out.println("Tickets pendientes:");
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado().toLowerCase().equals("abierto") || ticket.getEstado().toLowerCase().equals("en proceso")) {
                System.out.println(ticket.mostrarDetalle());
            }
        }
    }

    public void cerrarTicket(int id) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == id) {
                ticket.cerrarTicket();
                System.out.println("Ticket cerrado: " + ticket);
                return;
            }
        }
        System.out.println("Ticket no encontrado.");
    }

    public void asignarTecnico(int id, Tecnico tecnico) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == id) {
                ticket.asignarTecnico(tecnico);
                System.out.println("Técnico asignado: " + tecnico);
                return;
            }
        }
        System.out.println("Ticket no encontrado.");
    }

    public void asignarUsuario(int id, Usuario usuario) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == id) {
                ticket.setUsuario(usuario);
                System.out.println("Usuario asignado: " + usuario);
                return;
            }
        }
        System.out.println("Ticket no encontrado.");
    }

    public void cerrarTicket(TicketSoporte ticket) {   //permite cerrar ticket por objeto
        ticket.cerrarTicket();
        System.out.println("Ticket cerrado: " + ticket);
    }

    public void cerrarTicketId(int id) {    //permite cerrar ticket por id
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == id) {
                ticket.cerrarTicket();
                System.out.println("Ticket cerrado: " + ticket);
                return;
            }
        }
        System.out.println("Ticket no encontrado.");
    }


}
