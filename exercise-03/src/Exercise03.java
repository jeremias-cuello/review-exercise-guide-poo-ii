public class Exercise03 {
    public boolean isSorted(int[] array) {
        for (int pivot = 0; pivot < array.length - 1; pivot++) {
            for (int pivotNext = pivot + 1; pivotNext < array.length; pivotNext++) {
                if (!(array[pivot] <= array[pivotNext])) {
                    return false;
                }
            }
        }

        return true;
    }
}
