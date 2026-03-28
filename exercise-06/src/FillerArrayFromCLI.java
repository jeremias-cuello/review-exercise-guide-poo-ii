public class FillerArrayFromCLI implements FillerArray {
    @Override
    public int[] fillArray(int size) {
        int[] array = new int[size];
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter " + size + " integers:");

        for (int index = 0; index < size; index++) {
            System.out.print("Enter integer " + (index + 1) + ": ");
            array[index] = scanner.nextInt();
        }

        scanner.close();
        return array;
    }

}
