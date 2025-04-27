public enum TipoContrato {
    TIEMPO_COMPLETO,
    MEDIO_TIEMPO,
    TEMPORAL,
    FREELANCE;

    public void mostrarTipoContrato() {
        System.out.println("Tipo de contrato: " + this);
    }
}
