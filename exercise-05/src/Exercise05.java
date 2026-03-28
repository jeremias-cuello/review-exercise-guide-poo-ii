public class Exercise05 {
    public int sum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                sum += matrix[row][column];
            }
        }

        return sum;
    }
}
