import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class TicketSoporte {
    private static int id;
    private String descripcion;
    private String estado;
    private LocalDateTime fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;

    public String getAsignadoToString(Object asignado) {
        if (asignado == null) {
            return "No asignado";
        } else {
            return asignado.toString();
        }
    }

    public String getTecnicoString() {
        return getAsignadoToString(tecnico);
    }

    public String getUsuarioString() {
        return getAsignadoToString(usuario);
    }

    public TicketSoporte(String descipcion, Usuario usuario) {
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDateTime.now();
        id++;
    }

    public TicketSoporte(String descripcion) {
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDateTime.now();
        id++;
    }

    public TicketSoporte(String descripcion, Usuario usuario, Tecnico tecnico) {
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDateTime.now();
        this.usuario = usuario;
        this.tecnico = tecnico;
        id++;
    }

    public void cerrarTicket(){
        this.estado = "Cerrado";
    }

    public String dateToString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String fechaFormateada = this.fechaCreacion.format(formato);
        return fechaFormateada;
    }

    public String mostrarDetalle() {
        String mensaje = "Id: " + id + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Estado: " + estado + "\n" +
                "Tecnico: " + getTecnicoString() + "\n" +
                "Usuario: " + getUsuarioString()     + "\n" +
                "Fecha de creacion: " + dateToString() + "\n";

        return mensaje;
    }

    public void setUsuario(Usuario usuario) {
        System.out.println("El usuario " + usuario + " ha sido asignado al ticket " + id);
        this.usuario = usuario;
    }

    public void asignarTecnico(Tecnico tecnico) {
        System.out.println("El tecnico " + tecnico + " ha sido asignado al ticket " + id);
        this.tecnico = tecnico;
    }
}
