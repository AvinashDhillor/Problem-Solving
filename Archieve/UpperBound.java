
public class UpperBound {

    public static int upper_bound(Integer[] a, int key) {
        int l = 0, r = a.length;
        while (l != r) {
            int mid = l + r >> 1;
            if (a[mid] <= key) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        if (l == a.length) {
            return -1;
        }
        return r;
    }

    public static int lower_bound(Integer[] a, int key) {
        int l = 0, r = a.length;
        while (l != r) {
            int mid = l + r >> 1;
            if (a[mid] < key) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (l == a.length)
            return -1;

        return l;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[] { 1, 4, 5, 7, 8 };
        System.out.println(upper_bound(a, 6));
        System.out.println(lower_bound(a, 5));
        System.out.println(lower_bound(a, 100));
        System.out.println(lower_bound(a, 6));
    }
}
