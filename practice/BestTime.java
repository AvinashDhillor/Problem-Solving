import java.util.*;

public class BestTime {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for(int i = 1; i < prices.length; i++) {
            tmp += prices[i] - prices[i-1];
            if(tmp < 0) tmp = 0;
            max = Math.max(tmp, max);
        }
        return max;
    }

    static void solution() throws Exception {
        int[] a =  {7, 1, 5, 3, 6, 4};       
        sb.append(maxProfit(a));
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