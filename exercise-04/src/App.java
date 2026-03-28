import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arrayInput = new int[9];
        Exercise04 exercise = new Exercise04();

        for (int index = 0; index < arrayInput.length; index++) {
            System.out.print((index + 1) + " ingrese un numero: ");
            Integer data = Integer.parseInt(sc.nextLine());
            arrayInput[index] = data;
        }

        int sum = exercise.sum(arrayInput);

        System.out.println("La suma es: " + sum);
        sc.close();
    }
}
