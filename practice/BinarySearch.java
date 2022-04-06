import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 52, 242, 245, 223, 1212 };

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 2, 4, 223));
    }
}
