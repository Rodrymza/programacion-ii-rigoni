package ejercicio05;

public class NaveEspacial {
    String nombre;
    int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public NaveEspacial() {
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void despegar() {
        if (this.combustible >= 10) {
            System.out.println("La nave " + this.nombre + " ha despegado");
        } else {
            System.out.println("La nave " + this.nombre + " no tiene combustible suficiente para despegar");
        }
    }

    public void avanzar(int distancia) {
        if (this.combustible >= distancia ) {
            this.combustible -= distancia;
            System.out.println("La nave " + this.nombre + " ha avanzado " + distancia + " unidades de distancia \n" +
                    "Combustible restante: " + this.combustible);
        } else {
            System.out.println("La nave " + this.nombre + " no tiene combustible suficiente para avanzar " + distancia + " unidades de distancia");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (this.combustible + cantidad <= 100) {
            if (cantidad <= 0) {
                System.out.println("La nave " + this.nombre + " no puede recargar 0 o menos unidades de combustible");
            } else {
                this.combustible += cantidad;
                System.out.println("La nave " + this.nombre + " ha recargado " + cantidad + " unidades de combustible\n" +
                        "Combustible total: " + this.combustible);
            }
        } else {
            System.out.println("La nave " + this.nombre + " no puede recargar " + cantidad + " unidades de combustible (limite excedido)");

        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: \n Nombre: " + this.nombre + "\n" +
                "Combustible: " + this.combustible);
    }
}
