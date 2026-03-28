public class FillerArrayRandom implements FillerArray {
    @Override
    public int[] fillArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100); // Fill with random integers between 0 and 99
        }

        return array;
    }

}
