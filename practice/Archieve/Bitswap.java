import java.util.*;

public class Bitswap {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {

        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String[] arr = new String[n];
            String[] arr2 = new String[m];
            int countOne = 0, anCountOne = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }

            int sol = 0;
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.next();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    char c1 = arr[i].charAt(j);
                    char c2 = arr2[i].charAt(j);
                    if (c1 != c2)
                        sol++;
                    if (c1 == '1')
                        countOne++;
                    if (c2 == '1')
                        anCountOne++;
                }
            }

            if (anCountOne != countOne) {
                System.out.println(-1);
            } else {
                System.out.println(sol / 2);
            }

        }
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