import java.util.PriorityQueue;

public class SlidingMax {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(9);
        priorityQueue.add(9);
        priorityQueue.add(8);
        priorityQueue.add(7);

        System.out.println(priorityQueue);
    }
}
