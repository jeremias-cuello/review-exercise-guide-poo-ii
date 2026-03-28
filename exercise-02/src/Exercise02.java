public class Exercise02 {
    public int plusUntily(int number) {
        int sum = 0;

        for (int integer = 1; integer < number; integer++) {
            if (integer % 3 == 0 || integer % 5 == 0) {
                sum += integer;
            }
        }

        return sum;
    }
}
