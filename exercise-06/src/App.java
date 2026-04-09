import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        int sizeArray1 = rand.nextInt(10) + 1;
        int sizeArray2 = rand.nextInt(10) + 1;

        int[] array1 = FactoryFiller.getFiller(FillerTypes.RANDOM).fillArray(sizeArray1);
        int[] array2 = FactoryFiller.getFiller(FillerTypes.RANDOM).fillArray(sizeArray2);
        // int[] array1 = { 81, 88, 77, 77, 29 };
        // int[] array2 = { 25 };

        System.out.println("Arrays originals");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("====================");

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("Arrays sorted");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("====================");

        Exercise06 exercise = new Exercise06();
        int[] joinedArray = exercise.join(array1, array2);

        System.out.println("El array fusionado es: " + Arrays.toString(joinedArray));
    }
}
