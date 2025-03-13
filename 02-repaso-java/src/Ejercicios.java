import java.util.Scanner;

public class Ejercicios {
    public static void ejercicio01() {
        int number = 2;
        String name = "Rodrigo";
        char letter = 'a';
        boolean istrue = true;
        double decimal = 4;
    }

    public static void ejercicio02() {
        //Crea un programa que solicite al usuario su nombre y edad, y luego muestre un
        //mensaje con esos datos.
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String name = input.nextLine();
        System.out.println("Ingresa tu edad");
        String age = input.nextLine();

        System.out.println("Tu nombre es " + name + " y tu edad es " + age);
    }

    public static void ejercicio03() {
        //Escribe un programa que pida dos números al usuario y muestre su suma, resta,
        //multiplicación, división y módulo.

        int numberA = Utilidades.pedirnumero("Ingrese el primer numero");
        int numberB = Utilidades.pedirnumero("Ingrese el segundo numero");
        System.out.println("Operaciones matematicas:");
        System.out.println("La suma es :" + (numberA + numberB));
        System.out.println("La resta es :" + (numberA - numberB));
        System.out.println("La multiplicacion es :" + (numberA * numberB));
        System.out.println("La divison es :" + (numberA / numberB));
        System.out.println("El modulo es :" + (numberA % (numberB)));
    }

    public static void ejercicio04() {
        //Crea un programa que solicite dos números y determine si ambos son positivos y
        //mayores que 10.
        int numberA = Utilidades.pedirnumero("Ingrese el primer numero");
        int numberB = Utilidades.pedirnumero("Ingrese el segundo numero");

        Utilidades.validarPositivo(numberA);
        Utilidades.mayorQueDiez(numberA);
        Utilidades.validarPositivo(numberB);
        Utilidades.mayorQueDiez(numberB);

    }

    public static void ejercicio05() {
        int number = Utilidades.pedirnumero("Ingrese un numero");
        String mensaje = (0 <= number) ? "El numero es positivo" : "El numero es negativo";
        System.out.println(mensaje);

    }

    public static void ejercicio06() {
        //Crea un programa que pida dos números y determine cuál es mayor o si son iguales.
        int numberA = Utilidades.pedirnumero("Ingresa el primer numero");
        int numberB = Utilidades.pedirnumero("Ingresa el segundo numero");

        if (numberA > numberB) {
            System.out.println(numberA + " es mayor a " + numberB);
        } else {
            if (numberB > numberA) {
                System.out.println(numberB + " es mayor a " + numberA);
            } else {
                System.out.println("Ambos numeros son iguales");
            }
        }
    }

    public static void ejercicio07() {
        //Crea un programa que pida la edad de una persona y determine si es un niño (0-12),
        //adolescente (13-17) o adulto (18 en adelante).
        int age = Utilidades.pedirnumero("Ingrese su edad");
        if (age < 0 || age > 110) {
            System.out.println("Ingresaste una edad incorrecta");
        } else {
            if (age <= 12) {
                System.out.println("Eres niño");
            }
            if (age > 12 && age <= 17) {
                System.out.println("Eres adolescente");
            }
            if (age > 17) {
                System.out.println("Eres adulto");
            }
        }
    }

    public static void ejercicio08() {
        //Crea un programa que pida un número del 1 al 7 y muestre el día de la semana
        //correspondiente.
        int number = Utilidades.pedirnumero("Ingrese un numero del 1 al 7");
        String mensaje = "";
        switch (number) {
            case 1:
                mensaje = "Lunes";
                break;
            case 2:
                mensaje = "Martes";
                break;
            case 3:
                mensaje = "Miercoles";
                break;
            case 4:
                mensaje = "Jueves";
                break;
            case 5:
                mensaje = "Viernes";
                break;
            case 6:
                mensaje = "Sabado";
                break;
            case 7:
                mensaje = "Domingo";
                break;
            default:
                mensaje = "Numero invalido";
        }
        System.out.println(mensaje);
    }

    public static void ejercicio09() {
        //9- Escribe un programa que pida un número y determine si es par o impar.
        int numero = Utilidades.pedirnumero("Ingrese un numero cualquiera");
        String mensaje = (numero % 2 == 0) ? "El numero es par" : "El numero es impar";
        System.out.println(mensaje);
    }

    public static void ejercicio10() {
        //Crea un programa que pida el salario base de un empleado y el número de horas
        //extras trabajadas. Cada hora extra se paga al 50% adicional. Calcula y muestra el
        //salario final.

        int jornadaLaboral = 192;
        int salariobase = Utilidades.pedirnumero("Ingrese salario base");
        double valorHora = salariobase / jornadaLaboral;

        int cantidadHorasExtras = Utilidades.pedirnumero("Ingrese el total de horas extras trabajadas");
        double valorHoraExtra = valorHora * 1.5;
        double bonoExtras = cantidadHorasExtras * valorHoraExtra;

        System.out.println("El salario final será de $" + (bonoExtras + salariobase) + "\nDetalle:");
        System.out.println("Salario base $" + salariobase);
        System.out.println("Horas extras $" + bonoExtras);
        System.out.println("Valor hora extra $" + valorHoraExtra);

    }
}
