import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arrayInput = new int[9];
        Exercise03 exercise = new Exercise03();

        for (int index = 0; index < arrayInput.length; index++) {
            System.out.print((index + 1) + " ingrese un numero: ");
            Integer data = Integer.parseInt(sc.nextLine());
            arrayInput[index] = data;
        }

        if (exercise.isSorted(arrayInput)) {
            System.out.println("El arreglo esta ordenado.");
        } else {
            System.out.println("El arreglo NOOOOOOOO esta ordenado.");
        }

        sc.close();
    }
}
