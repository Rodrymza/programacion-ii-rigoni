public enum Continente {
    EUROPA (741000000, 10180000),
    ASIA( 4600000000l, 44579000),
    AFRICA( 1216000000, 30370000),
    AMERICA( 1000000000, 42370000),
    OCEANIA( 41000000, 8500000),
    ANTARTIDA( 1000, 14000000);
    private long cantidadHabitantes;
    private double superficie;

    // Constructor, debe ser privado
    private Continente(long cantidadHabitantes, double superficie) {
        this.cantidadHabitantes = cantidadHabitantes;
        this.superficie = superficie;
    }

    public double densidadHabitantes() {
        return cantidadHabitantes / superficie;
    }

    @Override
    public String toString() {
        return "Continente: " + this.name() + ", Habitantes: " + cantidadHabitantes + ", Superficie: " + superficie;
    }
}
