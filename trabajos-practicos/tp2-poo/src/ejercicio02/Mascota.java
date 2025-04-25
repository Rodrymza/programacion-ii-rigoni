package ejercicio02;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        if (edad >= 0 && edad <= 100){
            this.edad = edad;
        } else {
            System.out.println("La edad no es valida, se coloco una por defecto (0)");
        }
    }
    public Mascota() {}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100){
            this.edad = edad;
        } else {
            System.out.println("La edad no es valida, se coloco una por defecto (0)");
        }
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + "\nEspecie: " + this.especie + "\nEdad: " + this.edad);
    }
    public void cumplirAnios(){
        this.edad += 1;
        System.out.println("Feliz cumpleaños " + this.nombre + "! Ahora tiene " + this.edad + " años.");
    }
}
