public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 130) {
            throw new EdadInvalidaException("Edad no valida: " + edad);
        }
    }

    public void setEdad(int edad) throws EdadInvalidaException{
       validarEdad(edad);
       this.edad = edad;
    }
}
