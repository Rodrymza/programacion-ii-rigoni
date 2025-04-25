package Concesionaria;

public class Auto {
    private String patente;
    private String color;
    private int kmRecorridos;

    public Auto(String patente, String color, int kmRecorridos) {
        this.patente = patente;
        this.color = color;
        this.kmRecorridos = kmRecorridos;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return "Concesionaria.Auto{" +
                "color='" + color + '\'' +
                ", patente='" + patente + '\'' +
                ", kmRecorridos=" + kmRecorridos +
                '}';
    }
}
