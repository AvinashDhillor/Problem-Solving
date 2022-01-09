
public class NextPermutation {

    private static void next_permutation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i + 1] <= a[i])
            i--;

        if (i >= 0) {
            int j = a.length - 1;
            while (a[j] <= a[i])
                j--;

            swap(a, i, j);
        }
        reverse(a, i + 1);
    }

    private static void reverse(int[] a, int i) {
        int end = a.length - 1;
        while (i < end) {
            swap(a, i, end);
            i++;
            end--;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        next_permutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
