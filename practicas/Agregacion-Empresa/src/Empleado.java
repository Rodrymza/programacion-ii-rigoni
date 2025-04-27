public class Empleado {
    private String nombre;
    private String dni;
    private String puesto;

    public Empleado(String nombre, String dni, String puesto) {
        this.nombre = nombre;
        this.dni = dni;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + " DNI: " + dni +" Puesto: " + puesto;
    }
}
