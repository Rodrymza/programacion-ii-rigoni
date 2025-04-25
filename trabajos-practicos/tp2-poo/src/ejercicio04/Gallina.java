package ejercicio04;

public class Gallina {
    int idGalina;
    int edad;
    int huevosPuestos;

    public Gallina(int idGalina, int edad, int huevosPuestos) {
        this.idGalina = idGalina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public Gallina() {}

    public int getIdGalina() {
        return idGalina;
    }

    public void setIdGalina(int idGalina) {
        this.idGalina = idGalina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(int cantidad){
        this.huevosPuestos += cantidad;
        System.out.println("La cantidad de huevos puestos es ahora " + this.huevosPuestos);
    }

    public void envejecer() {
        this.edad ++;
        System.out.println("La gallina " + this.idGalina + " ahora tiene " + this.edad + " años");
    }

    public void mostrarEstado() {
        System.out.println("Gallina: \n ID Gallina: " + this.idGalina + "\n" +
                "Edad: " + this.edad + "\n" +
                "Huevos puestos: " + this.huevosPuestos);
    }
}
