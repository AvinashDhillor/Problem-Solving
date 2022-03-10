import java.util.*;

public class Test {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(24);
        list.add(3233);
        list.add(14);
        set.addAll(list);

        set.add(10);

        TreeMap<Integer, Integer> map = new TreeMap<>();

        map.put(5, 5);
        map.put(6, 6);
        map.put(4, 4);
        print(map.toString());
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