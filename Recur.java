
public class Recur {

    // Simple Recursion
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    static int[] term = new int[1000];

    // Memoized recursive code
    static int fib2(int n) {
        if (n <= 1)
            return n;
        if (term[n] != 0)
            return term[n];
        else {
            return term[n] = fib2(n - 1) + fib2(n - 2);
        }
    }

    public static void main(String[] args) {
        // Memoized recursive code
        long startTime = System.nanoTime();
        System.out.println(fib2(100));
        long endTime = System.nanoTime();
        System.out.println("Time : " + (endTime - startTime) / 1e9);

        // Simple Recursion
        startTime = System.nanoTime();
        System.out.println(fib(44));
        endTime = System.nanoTime();
        System.out.println("Time : " + (endTime - startTime) / 1e9);
    }
}
