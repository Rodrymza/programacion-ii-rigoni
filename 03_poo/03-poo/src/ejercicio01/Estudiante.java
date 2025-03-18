package ejercicio01;

public class Estudiante {
    private String apellido;
    private String nombre;
    private String curso;
    private double calificacion;

    public Estudiante(String apellido, String nombre, String curso, double calificacion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.curso = curso;
        if (Estudiante.esNumeroValido(calificacion)) {
            this.calificacion = calificacion;
        } else {
            this.calificacion = 5;
            System.out.println("La calificacion no es valida, se coloco una por defecto (5)");
        }
    }
    public Estudiante() {

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (Estudiante.esNumeroValido(calificacion)) {
            this.calificacion = calificacion;
        } else {
            this.calificacion = 5;
            System.out.println("La calificacion no es valida, se coloco una por defecto (5)");
        }

    }

    public void mostrarInfo() {
        System.out.println("Apellido: " + this.apellido + "\nNombre: " + this.nombre +  " \nCurso: " + this.curso + " \nCalificacion: " + this.calificacion);
    }

    public void subirCalificacion(double puntos) {

        if (this.calificacion + puntos <= 10 && esNumeroValido(puntos)) {
            this.calificacion += puntos;
            System.out.println("Se subio la calificacion: "  + this.calificacion);
        } else {
            System.out.println("No se puede subir la calificacion \nNota: " + this.calificacion);
        }
    }

    public void bajarCalificacion(double puntos) {
        if (this.calificacion - puntos >= 0 && esNumeroValido(puntos)) {
            this.calificacion -= puntos;
            System.out.println("Se bajo la calificacion " + this.calificacion);
        } else {
            System.out.println("No se puede bajar la calificacion \nNota: " + this.calificacion);
        }
    }

    public static boolean esNumeroValido(double numero) {
        if (numero >= 0 && numero <= 10) {
            return true;
        } else {
            System.out.println("El valor ingresado no puede ser negativo ni mayor a 10");
            return false;
        }
    }
}
