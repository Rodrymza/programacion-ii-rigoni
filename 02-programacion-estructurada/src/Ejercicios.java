public class Ejercicios {
    //Ejercicio 01, Año bisiesto
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
}
