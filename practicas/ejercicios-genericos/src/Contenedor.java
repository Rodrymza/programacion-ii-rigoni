public class Contenedor <T>{
    private T valor;

    public Contenedor() {
    }

    public Contenedor(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "valor=" + valor +
                '}';
    }

    public static <T> void imprimirElemento(T elemento){
        System.out.println("Elemento: " + elemento);
    }

    public static <T> boolean sonIguales(T elemento1, T elemento2){
        return elemento1.equals(elemento2);
    }
}
