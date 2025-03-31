import java.sql.SQLOutput;
import java.util.Scanner;
public class Ejercicios {
    //Ejercicio 01, Año bisiesto
    Scanner input = new Scanner(System.in);
    public static double descuentoEspecial = 0.10;

    public void anioBisiesto(int anio) {
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }

    //Ejercicio 02, mayor de tres numeros
    public void mayorDeTres(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("El número mayor es: " + num3);
        }
    }

    //Ejercicio 03, Clasificacion de edad
    public void clasificacionEdad(int edad) {
        if (edad <12) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
    }

    //Ejercicio 04, Calculadora de descuento
    public void calcularDescuento(int precio, String categoria) {
        double descuento = 0;
        switch (categoria) {
            case "A":
                descuento = precio * 0.1;
                break;
            case "B":
                descuento = precio * 0.2;
                break;
            case "C":
                descuento = precio * 0.3;
                break;
            default:
                System.out.println("Categoria no valida");
                break;
        }
        System.out.println("El descuento es $" + descuento);
        System.out.println("El precio final es $" + (precio - descuento));
    }
    //Ejercicio 05: Suma de Números Pares (Ciclo while)
    public void sumarPares(){
        int numeroUsuario;
        int suma = 0;
        do {
            System.out.println("Ingresa un numero cualquiera (0 para terminar)");
            numeroUsuario = Integer.parseInt(input.nextLine());
            if (numeroUsuario % 2 == 0) {
                suma += numeroUsuario;
            }
        } while (numeroUsuario != 0);
        System.out.println("La suma de numeros pares es: " + suma);
    }

    //Ejercicio 06: Contador de Números Positivos y Negativos (Ciclo for)
    public void contarNumeros() {
        int numero;
        int numerosPositivos = 0;
        int numerosNegativos = 0;
        for (int i = 0; i <10 ; i++) {
            System.out.println("Ingrese cualquier numero (" + (i+1) + "/10)");
            numero = Integer.parseInt(input.nextLine());
            if (numero >= 0) {
                numerosPositivos++;
            } else {
                numerosNegativos++;
            }
        }
        System.out.println("Numeros positivos: " + numerosPositivos + "\n" +
                "Numeros negativos: " + numerosNegativos);
    }
    public void validarEntrada(){
        int nota;
        do {
            System.out.println("Ingrese una nota");
            nota = Integer.parseInt(input.nextLine());
            if (nota<0 || nota > 10) {
                System.out.println("Ingrese una nota valida");
            }
        }while (nota <0 || nota >10);
        System.out.println("La nota es " + nota);
    }
    //Ejercicio 8: Cálculo del Precio Final de un Producto (Funciones en Java)
    //Crea un metodo calcularPrecioFinal(double precioBase, double
    //impuesto, double descuento) que calcule el precio final de un producto en un
    //e-commerce. La fórmula es:
    //PrecioFinal=PrecioBase+(PrecioBase×Impuesto)−(PrecioBase×Descuento)PrecioFinal
    //PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
    public double calcularPrecioFinal(double preciobase, double impuesto, double descuento) {
        impuesto /= 100;
        descuento /= 100;
        double precioFinal =  preciobase+(preciobase*impuesto)-(preciobase*descuento);
        System.out.println("Impuesto: $" + preciobase*impuesto);
        System.out.println("Descuento: $" + preciobase*descuento);
        System.out.println("El preciofinal es $" + precioFinal);
        return precioFinal;
    }

    //Ejercicio 09 Calculo de Envio
    public double calcularCostoEnvio(double peso, String zona) {
        int costoNacional = 5;
        int costoInternacional = 10;
        double costoFinal;
        switch (zona) {
            case "Nacional":
                costoFinal = costoNacional * peso;
                System.out.println("El costo de envio es $" + costoFinal);
                return costoFinal;
            case "Internacional":
                costoFinal = costoInternacional * peso;
                System.out.println("El costo de envio es $" + costoFinal);
                return costoFinal;
            default:
                System.out.println("Zona no valida");
                return 0;
        }
    }
    public double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double totalCompra = precioProducto + costoEnvio;
        System.out.println("El total de la compra es $" + totalCompra);
        return totalCompra;
    }

    //Ejercicio 10: Gestion de Stock
    public int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int stockFinal = stockActual - cantidadVendida + cantidadRecibida;
        System.out.println("El stock final es " + stockFinal);
        return stockFinal;
    }

    //Ejercicio 11: Variables globales y locles
    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = (precio * descuentoEspecial);
        System.out.println("El descuento total es de $" + descuentoAplicado);
        return (precio - descuentoAplicado);
    }

    //Ejercicio 12: Lista de precios de productos con Modificacion
    public static void mostrarProductos(double[] precios) {
        System.out.println("Lista de precios");
        for (double precio : precios) {
            System.out.println("El precio del producto es $" + precio);
        }
    }
    //Ejercicio 13: Funcion recursiva
    public static void funcionRecursiva(int indice, double[] array) {
        if (indice == 0) {
            System.out.println("El precio del producto es $" + array[indice]);
        } else {
            System.out.println("El precio del producto es $" + array[indice]);
            funcionRecursiva(indice - 1, array);
        }
    }

}
