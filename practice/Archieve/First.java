import java.util.*;

public class First {

    public static int sol(int[] arr) {
        int l = 0, r = arr.length - 1;
        int count = 0;
        int previousMax = -1;
        while (l <= r) {
            if (arr[l] < arr[r]) {
                if (previousMax <= arr[l]) {
                    count++;
                    previousMax = arr[l];
                }
                l++;
            } else {
                if (previousMax <= arr[r]) {
                    count++;
                    previousMax = arr[r];
                }
                r--;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(sol(arr));
        }
    }
}