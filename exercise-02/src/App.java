import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero para sumar: ");
        String input = sc.nextLine();
        Exercise02 exercise = new Exercise02();

        try {
            int number = Integer.parseInt(input);
            System.out.println("La suma de multiplos es: " + exercise.plusUntily(number));
        } catch (NumberFormatException e) {
            System.out.println("Ingresaste algo que no es un número");
        } finally {
            sc.close();
        }
    }
}
