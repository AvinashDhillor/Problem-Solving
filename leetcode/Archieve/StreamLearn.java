import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamLearn {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);

        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        for (int i : arr) {
            System.out.println(i);
        }

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        map.put(100, 200);

        // int[] arr1 = map.entrySet().stream().map(x -> x.getValue() *
        // 10).mapToInt(Integer::intValue).toArray();

        // int[] arr2 = map.entrySet().stream().map(x -> x.getValue() * 10).max(-> x -
        // y)
        // .mapToInt(Integer::intValue)
        // .toArray();

        // for (int i : arr2) {
        // System.out.println(i);
        // }

    }
}
