package Clase;

public class Silla {
    private Pata[] patas;
    private int numPatas = 0;

    public Silla() {
        patas = new Pata[4];
    }

    public void agregarPatas(String material, String color) {
        patas[numPatas] = new Pata(material, color);
        numPatas++;
    }
}
