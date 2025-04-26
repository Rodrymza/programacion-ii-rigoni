import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {       //evitar duplicados
            estudiantes.add(estudiante);
            estudiante.asignarUniversidad(this);
        }
    }
}
