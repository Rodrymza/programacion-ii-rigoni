public class Main {
    public static void main(String[] args) {

        System.out.println(NivelEstudio.SECUNDARIO.toString());
        System.out.println(NivelEstudio.SECUNDARIO.ordinal());

        System.out.println("Niveles de estudio disponibles:");
        NivelEstudio[] niveles = NivelEstudio.values();
        for (NivelEstudio nivel : niveles) {
            System.out.println((nivel.ordinal()+1) + ") " + nivel);
        }
        NivelEstudio nivel = NivelEstudio.valueOf("SECUNDARIO");
        System.out.println("Nivel de estudio seleccionado: " + nivel);

        Continente continentes[] = Continente.values();
        for (Continente continente : continentes) {
            System.out.println("Densidad de habitantes de " + continente.name() + ": " + continente.densidadHabitantes());
        }

    }
}