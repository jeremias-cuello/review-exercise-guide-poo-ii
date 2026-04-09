
import java.util.Random;
import java.util.Scanner;

public class Exercise07 {
    public int generateNumberRandom(int min, int max) {
        Random rand = new Random();
        int numberRandom = rand.nextInt(max + 1) + min;
        return numberRandom;
    }

    public int enterNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to guess: ");
        String numberString = sc.nextLine();
        int number = Integer.parseInt(numberString);
        return number;
    }
}
