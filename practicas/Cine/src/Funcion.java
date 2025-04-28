import java.util.ArrayList;

public class Funcion {
    private String horario;
    private Pelicula pelicula;
    private ArrayList<Entrada> entradas;

    public Funcion(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
