import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Concesionaria {
    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }
    public void mostrarAutos() {
        if (autos.isEmpty()) {
            System.out.println("No hay autos");
        } else {
            System.out.println("Lista de autos:");
            for (Auto auto : autos) {
                System.out.println(auto);
            }
        }
    }
    public void agregarAuto(Auto auto) {
        autos.add(auto);
        System.out.println("Auto agregado: " + auto);
    }
    public int totalAutos() {
        return autos.size();
    }
    public int sumatoriaRecorridos() {
        int sumatoria = 0;
        for (Auto auto : autos) {
            sumatoria += auto.getKmRecorridos();
        }
        return sumatoria;
    }
    public double promedioKmRecorridos() {
        return autos.isEmpty() ? 0 : (double) sumatoriaRecorridos() / totalAutos();
    }

    private int maxKmRecorrido() {
        int max = 0;
        for (Auto auto : autos) {
            if (auto.getKmRecorridos() > max) {
                max = auto.getKmRecorridos();
            }
        }
        return max;
    }

    /*public Auto autoMasKmRecorridos(){
        Auto autoMax = null;
        int cantMaxima = 0;
        for (Auto auto : autos) {
            if (auto.getKmRecorridos() > cantMaxima) {
                cantMaxima = auto.getKmRecorridos();
                autoMax = auto;
            }
        }
        return autoMax;
    }

    public ArrayList<Auto> autosMasKmRecorridos() {
        ArrayList<Auto> autosMas = new ArrayList<>();
        int maxRecorrido = maxKmRecorrido();
        for (Auto auto : this.autos) {
            if (auto.getKmRecorridos() == maxRecorrido) {
                autosMas.add(auto);
            }
        }
        return autosMas;
    } */

    public ArrayList<Auto> autosMasKmRecorridos() {
        ArrayList<Auto> autosMas = new ArrayList<>();
        int maxRecorrido = -1;
        for (Auto auto : this.autos) {
            if (auto.getKmRecorridos() == maxRecorrido) {
                autosMas.add(auto);
            } else if (auto.getKmRecorridos() > maxRecorrido) {
                maxRecorrido = auto.getKmRecorridos();
                autosMas.clear(); // Limpiar la lista antes de agregar el nuevo auto
                autosMas.add(auto);
            }
        }
        return autosMas;
    }

    public Auto autoMenosKmRecorridos() {
        Auto autoMin = null;
        int cantMinima = Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if (auto.getKmRecorridos() < cantMinima) {
                cantMinima = auto.getKmRecorridos();
                autoMin = auto;
            }
        }
        return autoMin;
    }

    public Auto buscarAuto(String patente) {
        Auto autoEncontrado = null;
        int i = 0;
        while (i < autos.size() && !autos.get(i).getPatente().equalsIgnoreCase(patente)){
            i++;
        }
        if (i<autos.size()){
            autoEncontrado = autos.get(i);
        }
        return autoEncontrado;
    }

    //busqueda con iterator
    public Auto buscarAutoIterator(String patente) {
        Auto auto = null;
        Iterator<Auto> iterator = autos.iterator();
        while (iterator.hasNext() && auto == null) {
            Auto currentAuto = iterator.next();
            if (currentAuto.getPatente().equalsIgnoreCase(patente)) {
                return currentAuto;
            }
        }
         // Si no se encontró el auto, auto seguirá siendo null
         // Si se encontró, auto contendrá la referencia al auto encontrado
         // Se puede retornar directamente

        return null;
    }
}
