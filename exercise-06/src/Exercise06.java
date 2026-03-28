public class Exercise06 {
    public int[] join(int[] arrayOne, int[] arrayTwo) {
        int[] mergedArray = new int[arrayOne.length + arrayTwo.length];

        int indexArrayOne = 0;
        int indexArrayTwo = 0;
        int indexMerged = 0;

        while (indexMerged < arrayOne.length + arrayTwo.length) {

            if (indexArrayOne >= arrayOne.length) {
                mergedArray[indexMerged++] = arrayTwo[indexArrayTwo++];
                continue;
            }

            if (indexArrayTwo >= arrayTwo.length) {
                mergedArray[indexMerged++] = arrayOne[indexArrayOne++];
                continue;
            }

            if (arrayOne[indexArrayOne] < arrayTwo[indexArrayTwo]) {
                mergedArray[indexMerged++] = arrayOne[indexArrayOne++];
            } else {
                mergedArray[indexMerged++] = arrayTwo[indexArrayTwo++];
            }
        }

        return mergedArray;
    }
}
