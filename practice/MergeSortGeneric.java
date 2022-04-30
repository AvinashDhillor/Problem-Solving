import java.util.Arrays;

public class MergeSortGeneric {

    private static class Sort<T extends Comparable<? super T>> {

        public void mergeSort(T[] array, int start, int end) {
            if (start < end) {
                int mid = (start + end) / 2;

                mergeSort(array, start, mid);
                mergeSort(array, mid + 1, end);
                merge(array, start, mid, end);
            }
        }

        void merge(T[] array, int start, int middle, int end) {
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

            while (leftIndex < leftArray.length)
                array[currentIndex++] = leftArray[leftIndex++];

            while (rightIndex < rightArray.length)
                array[currentIndex++] = rightArray[rightIndex++];
        }
    }

    private static class CustomObject implements Comparable<CustomObject> {
        int i;

        public CustomObject(int i) {
            this.i = i;
        }

        @Override
        public int compareTo(CustomObject o) {
            return o.i - this.i;
        }

        public String toString() {
            return this.i + "";
        }

    }

    public static void main(String[] args) {
        CustomObject[] customObjects = new CustomObject[4];
        customObjects[0] = new CustomObject(10);
        customObjects[1] = new CustomObject(5);
        customObjects[2] = new CustomObject(1);
        customObjects[3] = new CustomObject(52);
        Arrays.sort(customObjects);
        System.out.println(Arrays.toString(customObjects));

        Sort<CustomObject> sort = new Sort<>();
        sort.mergeSort(customObjects, 0, 3);
    }
}
