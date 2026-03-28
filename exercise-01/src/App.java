import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero a saber si es primo: ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            Exercise01 exercise = new Exercise01();

            if (exercise.isPrime(number)) {
                System.out.println("El numero es primo");
            } else {
                System.out.println("El numero es compuesto");
            }

        } catch (NumberFormatException e) {
            System.out.println("Ingresaste algo que no es un número");
        } finally {
            sc.close();
        }
    }
}
