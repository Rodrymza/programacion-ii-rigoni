public enum Semaforo {
    ROJO,
    AMARILLO,
    VERDE;

    public void accion() {
        switch (this) {
            case ROJO:
                System.out.println("Estado del semáforo: Rojo \nDetenerse");
                break;
            case AMARILLO:
                System.out.println("Estado del semáforo: Amarillo \nPrecaución");
                break;
            case VERDE:
                System.out.println("Estado del semáforo: Verde \nAvanzar");
                break;
            default:
                System.out.println("Estado del semáforo no válido");
                break;
        }
    }
}
