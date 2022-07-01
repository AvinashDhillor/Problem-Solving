import java.util.*;

public class Logs {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    int[] sol(String[] logs, int thresold) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (String i : logs) {
            String[] tmp = i.split(" ");
            int a = Integer.valueOf(tmp[0]);
            int b = Integer.valueOf(tmp[1]);
            mp.put(a, mp.getOrDefault(a, 0) + 1);
            mp.put(b, mp.getOrDefault(b, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() >= thresold)
                list.add(entry.getKey());
        }
        int[] sol = new int[list.size()];
        int index = 0;
        for (int i : list)
            sol[index++] = i;
        return sol;
    }

    static void solution() throws Exception {
        String logs[] = { "88 99 200" };
        int thresold = 2;

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

class Pair implements Comparable<Pair> {
    public int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int compare(Pair p1, Pair p2) {
        if (p1.first == p2.first)
            return p1.second - p2.second;
        return p1.first - p2.first;
    }

    public int compareTo(Pair p1) {
        if (this.first == p1.first)
            return this.second - p1.second;
        return this.first - p1.first;
    }

    public String toString() {
        return "[" + first + "," + second + "]";
    }
}
