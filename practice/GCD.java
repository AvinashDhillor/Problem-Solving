import java.math.BigInteger;

public class GCD {

    static int findGCD(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        if(a > b) return findGCD(a - b, b);
        else return findGCD(a, b- a);
    }

    public static void main(String[] args) {
        /*
        int a = 1000330, b = 13425;
        BigInteger gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));
        int ab = gcd.intValue();
        System.out.println(ab);

        char[] av = { 'a', 'v', 'i' };
        StringBuilder sb = new StringBuilder(String.valueOf(av));
        sb.setCharAt(1, 'b');
        System.out.println(sb); 
        System.out.println(findGCD(20, 10)); */
        int a = 1000;
        int b = 525;
        print(findGCD(a , b));
        
        BigInteger p = BigInteger.valueOf(a);
        BigInteger q = BigInteger.valueOf(b);
        int ans = p.gcd(q).intValue();
        print(ans);

    }
    
    static void print(Object o) {
        System.out.println(o);
    }
}
