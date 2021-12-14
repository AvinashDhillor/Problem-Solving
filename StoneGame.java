import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StoneGame {

    public static void main(String[] args) {
        Integer[] a = new Integer[] { 1, 2, 3, 4, 5 };
        List<Integer> list = Arrays.asList(a);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        a[1] = 100;
        System.out.println();
        it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}