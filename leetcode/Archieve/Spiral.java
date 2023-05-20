import java.util.ArrayList;
import java.util.List;

public class Spiral {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int l = 0, r = matrix[0].length - 1, u = 0, d = matrix.length - 1;
        int current = 0;
        int total = (r + 1) * (d + 1);
        do {
            for (int i = l; i <= r; i++) {
                list.add(matrix[u][i]);
                current++;
            }
            u++;
            if (current >= total)
                return list;
            for (int i = u; i <= d; i++) {
                list.add(matrix[i][r]);
                current++;
            }
            r--;
            if (current >= total)
                return list;
            for (int i = r; i >= l; i--) {

                list.add(matrix[d][i]);
                current++;
            }
            d--;
            if (current >= total)
                return list;
            for (int i = d; i >= u; i--) {

                list.add(matrix[i][l]);
                current++;
            }
            l++;
        } while (current < total);

        return list;
    }

    public static void main(String[] args) {

    }
}
