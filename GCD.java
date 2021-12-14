import java.math.BigInteger;

public class GCD {
    public static void main(String[] args) {
        int a = 1000330, b = 13425;
        BigInteger gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));
        int ab = gcd.intValue();
        System.out.println(ab);

        char[] av = { 'a', 'v', 'i' };
        StringBuilder sb = new StringBuilder(String.valueOf(av));
        sb.setCharAt(1, 'b');
        System.out.println(sb);
    }
}
