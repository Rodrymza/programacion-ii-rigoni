public enum DiaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;

    public boolean diaLaborable() {
        return this != SABADO && this != DOMINGO;
    }
}
