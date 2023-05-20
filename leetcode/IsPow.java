public class IsPow {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Integer.toBinaryString(n));
        n = n - 1;
        int b = n & (n + 1);
        System.out.println(b);
    }
}
