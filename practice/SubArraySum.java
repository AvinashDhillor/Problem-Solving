import java.util.*;

public class SubArraySum {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int sum = 0;
        int back_pointer = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum > s) {
                sum -= arr[back_pointer++];
            }
            if (sum == s) {
                ArrayList<Integer> solution = new ArrayList<>();
                solution.add(back_pointer + 1);
                solution.add(i + 1);
                return solution;
            }
        }
        return new ArrayList<>(Arrays.asList(new Integer[] { -1 }));
    }

    static void solution() throws Exception {
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print(subarraySum(arr, n, s).toString());
    }

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        sb = new StringBuilder();

        solution();
        print(sb);

        sc.close();
    }

    static void print(Object s) {
        System.out.print(s);
    }

}