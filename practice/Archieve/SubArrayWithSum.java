import java.util.*;

public class SubArrayWithSum {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    private static class CustomQueue {

        private class StoreIndex {
            private int index;
            private int Value;

            public StoreIndex(int index, int value) {
                this.index = index;
                this.Value = value;
            }
        }

        private Deque<StoreIndex> queue;

        private int sum = 0;
        private int target;

        public CustomQueue(int target) {
            queue = new ArrayDeque<>();
            this.target = target;
        }

        void add(int index, int value) {
            queue.add(new StoreIndex(index, value));
            sum += value;
            normal();
        }

        public boolean found() {
            return sum == target;
        }

        public String pr() {
            return queue.toString();
        }

        public ArrayList<Integer> toList() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(queue.peek().index + 1);
            list.add(queue.getLast().index + 1);
            return list;
        }

        private void normal() {
            if (sum > target) {
                sum -= queue.poll().Value;
            }
        }
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        CustomQueue customQueue = new CustomQueue(s);
        for (int i = 0; i < arr.length; i++) {
            customQueue.add(i, arr[i]);
            if (customQueue.found())
                return customQueue.toList();
        }
        ArrayList<Integer> arrayList = subarraySum(arr, n, s);
        return arrayList;
    }

    static void solution() throws Exception {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = 10;
        int s = 15;
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