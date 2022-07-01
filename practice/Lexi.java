import java.util.ArrayList;
import java.util.List;

public class Lexi {

    static List<Integer> ans = new ArrayList<>();

    public static void util(int n, int i, int target) {
        if (n * 10 + i > target)
            return;
        ans.add(n * 10 + i);
        util(n * 10 + i, 0, target);
        if (i + 1 < 10)
            util(n, i + 1, target);
    }

    public static List<Integer> sol(int n) {
        for (int i = 1; i <= 9; i++) {
            ans.add(i);
            util(i, 0, n);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 100;

        List<Integer> list = sol(n);
        System.out.println(list.toString());
    }
}
