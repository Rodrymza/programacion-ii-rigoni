package ejercicio04;

public class Gallilna {
    int idGalina;
    int edad;
    int huevosPuestos;

    public Gallilna(int idGalina, int edad, int huevosPuestos) {
        this.idGalina = idGalina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public Gallilna() {}

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

    public void ponerHuevo(){
        this.huevosPuestos ++;
        System.out.println("La cantidad de huevos puestos es ahora " + this.huevosPuestos);
    }
}
