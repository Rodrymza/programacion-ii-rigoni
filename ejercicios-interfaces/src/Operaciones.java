public interface Operaciones {
    double operar(double a, double b);
    default void mostrarInfo(){
        System.out.println("Operaciones matematicas");
    }
    static void mostrarMensaje(String mensaje){
        System.out.println("Este es el mensaje desde Operaciones: " + mensaje);
    }

}
