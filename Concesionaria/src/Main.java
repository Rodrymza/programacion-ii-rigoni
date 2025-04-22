public class Main {
    public static void main(String[] args) {
        Concesionaria miConcesionaria = new Concesionaria("Mi Concesionaria");
        miConcesionaria.mostrarAutos();
        miConcesionaria.agregarAuto(new Auto("ABC123", "Rojo", 25000));
        miConcesionaria.agregarAuto(new Auto("CDE443", "Verde", 45000));
        miConcesionaria.agregarAuto(new Auto("DDF443", "Celeste", 42900));
        miConcesionaria.agregarAuto(new Auto("DDF443", "Azul", 35800));
        miConcesionaria.agregarAuto(new Auto("DDF443", "Azul", 45000));
        miConcesionaria.agregarAuto(new Auto("ABC123", "Rojo", 25000));

        miConcesionaria.mostrarAutos();

        System.out.println("Total de km recoridos en autos: " + miConcesionaria.sumatoriaRecorridos());
        System.out.println("Promedio de km recorridos en autos: " + miConcesionaria.promedioKmRecorridos());
        System.out.println("Autos con mas km recorridos: " + miConcesionaria.autosMasKmRecorridos());
        System.out.println("Auto con menos km recorridos: " + miConcesionaria.autoMenosKmRecorridos());
    }
}