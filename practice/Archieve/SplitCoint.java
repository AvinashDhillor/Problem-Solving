import java.util.*;

public class SplitCoint {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static String splitWise(int[] coins) {
        int sum = 0, s = coins.length;
        for (int i = 0; i < coins.length; i++)
            sum = sum + coins[i];
        // cout<<sum;
        sum = sum / 100;
        if (sum % 2 == 0 && s % 2 == 0) {
            // cout<<sum;
            return "Yes";
        } else
            return "No";
        // solve here
    }

    static void solution() throws Exception {
        int[] coints = { 200, 200, 200, 100, 100, 100 };
        print(splitWise(coints));
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