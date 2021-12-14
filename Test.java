import java.util.ArrayList;
import java.util.List;

public class Test {

    static void modify(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }

    static void modify(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, 0);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(53);
        list.add(52);
        list.add(523);
        modify(list);
        System.out.println(list.toString());
    }
}
