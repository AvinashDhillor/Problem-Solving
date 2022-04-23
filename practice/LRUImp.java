import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRUImp {
    private Deque<Integer> dequeue;
    private HashSet<Integer> hashSet;
    private final int CACHE_SIZE;

    LRUImp(int capacity) {
        dequeue = new LinkedList<>();
        hashSet = new HashSet<>();
        this.CACHE_SIZE = capacity;
    }

    public void refer(int page) {
        if (!hashSet.contains(page)) {
            if (dequeue.size() == CACHE_SIZE) {
                int last = dequeue.removeLast();
                hashSet.remove(last);
            }
        } else {
            dequeue.remove(page);
        }
        dequeue.addFirst(page);
        hashSet.add(page);
    }

}