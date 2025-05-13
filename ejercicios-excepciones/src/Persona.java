public class Persona {
    private String nombre;
    private int edad;
    final int EDADMAXIMA = 130;
    final int EDADMINIMA = 0;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < EDADMINIMA) {
            throw new EdadInvalidaException("La edad no puede ser menor a " + EDADMINIMA );
        } else if (edad > EDADMAXIMA) {
            throw new EdadInvalidaException("La edad no puede superar los " + EDADMAXIMA + " años");
        }
    }

    public void setEdad(int edad) throws EdadInvalidaException{
       validarEdad(edad);
       this.edad = edad;
    }
}
