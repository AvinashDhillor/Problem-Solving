/**
 * Minimum_Flips_to_Make_a_OR_b_Equal_to_c_1318
 */
public class Minimum_Flips_to_Make_a_OR_b_Equal_to_c_1318 {

    public static int minFlips(int a, int b, int c) {
        int answer = 0;
        while (a != 0 | b != 0 | c != 0) {
            if ((c & 1) == 1) {
                if ((a & 1) == 0 && (b & 1) == 0) {
                    answer++;
                }
            } else {
                answer += (a & 1) + (b & 1);
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(minFlips(2, 6, 5));
    }
}