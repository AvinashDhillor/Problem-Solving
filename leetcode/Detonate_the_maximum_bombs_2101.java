import java.util.*;

public class Detonate_the_maximum_bombs_2101 {

    class Pair implements Comparable<Pair> {
        int x, y, z;

        Pair(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public int compareTo(Detonate_the_maximum_bombs_2101.Pair o) {
            if (x == o.x)
                return y - o.y;
            return x - o.x;
        }

    }

    public int maxiumDetonation(int[][] bombs) {
        List<Pair> list = new ArrayList<>();

        for (int[] i : bombs) {
            list.add(new Pair(i[0], i[1], i[2]));
        }

        Arrays.sort(list);

        return 0;
    }

    public static void main(String[] args) {

    }
}
