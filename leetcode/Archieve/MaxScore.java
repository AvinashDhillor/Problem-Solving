import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * MaxScore
 */
public class MaxScore {

    public static void main(String[] args) {
        int a = 1_000_000;

        boolean[] primes = new boolean[a + 1];

        Arrays.fill(primes, true);

        primes[1] = false;
        primes[2] = true;

        for (int i = 2; i * i <= a; i++) {
            if (primes[i] == true) {
                for (int j = i * 2; j <= a; j += i) {
                    primes[j] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (primes[i]) {
                list.add(i);
            }
        }

        int index = 0;

        while (a != 1) {
            int num = list.get(index);
            System.out.print(num);
            System.out.print("->" + a);
            if (a % num == 0) {
                a /= num;
            } else {
                index++;
            }
            System.out.println();
        }
    }
}