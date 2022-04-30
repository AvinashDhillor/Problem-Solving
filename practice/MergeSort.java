import java.util.Arrays;

public class MergeSort<T extends Comparable<? super T>> {

    public void mergeSort(T[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    public void merge(T[] array, int start, int middle, int end) {
        T[] leftArray = (T[]) new Comparable[middle - start + 1];
        T[] rightArray = (T[]) new Comparable[end - middle];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[start + i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[middle + 1 + i];
        }

        int leftIndex = 0, rightIndex = 0;
        int currentIndex = start;
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0) {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        while (leftIndex < leftArray.length) {
            array[currentIndex++] = leftArray[leftIndex++];
        }
        while (rightIndex < rightArray.length) {
            array[currentIndex++] = rightArray[rightIndex++];
        }
    }

    public static void main(String[] args) {
        Integer[] in = { 534, 31, 124, 124, 423, 131 };
        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.mergeSort(in, 0, in.length - 1);
        System.out.println(Arrays.toString(in));
    }
}
