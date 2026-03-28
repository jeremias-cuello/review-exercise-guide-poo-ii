import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int ROWS = 3;
        int COLUMNS = 3;

        Scanner sc = new Scanner(System.in);
        int[][] matrixInput = new int[ROWS][COLUMNS];
        Exercise05 exercise = new Exercise05();

        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < ROWS; column++) {
                System.out.print("[" + (row + 1) + "][" + (column + 1) + "] ingrese un numero: ");
                Integer data = Integer.parseInt(sc.nextLine());
                matrixInput[row][column] = data;
            }
        }

        int sum = exercise.sum(matrixInput);

        System.out.println("La suma es: " + sum);
        sc.close();
    }
}
