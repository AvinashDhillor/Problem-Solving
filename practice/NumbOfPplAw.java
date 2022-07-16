import java.util.*;

public class NumbOfPplAw {

    final static long mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    
    public static int peopleAwareOfSecret(int n, int delay, int forget) {
        int[] arr = new int[n + 1];
        arr[1] = 1;

        for(int i = 1; i <= n; i++) {
            int base = i;
            int limit = Math.min(n, forget + base - 1);
            if(arr[i] == 0) continue;
            for(int j = i + delay; j <= limit; j++) {
                arr[j] = arr[j] + arr[i];
            }
            System.out.println(Arrays.toString(arr));
        }
        long sum = 0;

        for(int i = n; i > n - forget; i--) {
            sum += arr[i];
        }

        return (int)(sum % mod);
    }

    static void solution() throws Exception {
        System.out.println(peopleAwareOfSecret(6, 2, 4));
        System.out.println(peopleAwareOfSecret(4, 1, 3));
        System.out.println(peopleAwareOfSecret(4, 1, 4));

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