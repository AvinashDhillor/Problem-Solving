import java.util.HashMap;
import java.util.Map;

public class finb {

    static Map<Integer, Integer> map = new HashMap<>();

    public static int fib(int n) {
        if (n <= 2)
            return 1;
        if (map.get(n) != null) {
            return map.get(n);
        }
        int ans = fib(n - 1) + fib(n - 2);
        map.put(n, ans);
        return ans;
    }

    public static void main(String[] args) {
        double startTime = System.nanoTime();
        System.out.println(fib(60));
        double endTime = System.nanoTime();
        System.out.printf("%.5f", (endTime - startTime) / 1e9);
    }
}