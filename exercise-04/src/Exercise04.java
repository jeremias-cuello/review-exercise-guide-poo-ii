public class Exercise04 {
    public int sum(int[] array) {
        int sum = 0;

        for (int index = 0; index < array.length; index += 2) {
            sum += array[index];
        }

        return sum;
    }
}
