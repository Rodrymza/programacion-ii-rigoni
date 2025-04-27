import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana");
        String dia = input.nextLine().toUpperCase();

  try {
            DiaSemana diaSemana = DiaSemana.valueOf(dia);
            if (diaSemana.diaLaborable()) {
                System.out.println("Es un dia laborable");
            } else {
                System.out.println("No es un dia laborable");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Dia no valido");
        }
  Semaforo semaforo = Semaforo.VERDE;
  semaforo.accion();
    }

}