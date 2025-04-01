package Clase;

import javax.print.Doc;

public class Impresora {
    private String modelo;

    public Impresora(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void imprimir(Documento documento) {
        System.out.println("Imprimiendo...");
        System.out.println(documento.getContenido());
    }

}
