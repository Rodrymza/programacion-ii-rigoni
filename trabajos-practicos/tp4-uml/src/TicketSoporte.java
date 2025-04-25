import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class TicketSoporte {
    private static int contador = 1;
    private int id = contador++;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TicketSoporte(String descripcion, Usuario usuario) {
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDateTime.now();
        this.usuario = usuario;
    }

    public TicketSoporte(String descripcion) {
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDateTime.now();
    }

    public TicketSoporte(String descripcion, Usuario usuario, Tecnico tecnico) {
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDateTime.now();
        this.usuario = usuario;
        this.tecnico = tecnico;
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void cerrarTicket(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String fechaHora = LocalDateTime.now().format(formato);
        this.estado = "Cerrado - " + fechaHora;
    }

    public String dateToString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String fechaFormateada = this.fechaCreacion.format(formato);
        return fechaFormateada;
    }

    public String mostrarDetalle() {
        return  "Id: " + id + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Estado: " + estado + "\n" +
                "Tecnico: " + getTecnicoString() + "\n" +
                "Usuario: " + getUsuarioString()     + "\n" +
                "Fecha de creacion: " + dateToString() + "\n";
    }

    public void setUsuario(Usuario usuario) {
        System.out.println("El usuario " + usuario + " ha sido asignado al ticket " + id);
        this.usuario = usuario;
    }

    public void asignarTecnico(Tecnico tecnico) {
        System.out.println("El tecnico " + tecnico + " ha sido asignado al ticket " + id);
        this.tecnico = tecnico;
        this.estado = "En Proceso";
    }


}
