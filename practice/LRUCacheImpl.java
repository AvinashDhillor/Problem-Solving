import java.util.HashMap;
import java.util.Map;

public class LRUCacheImpl<K, V> {

    private int capacity;
    private int size;
    private Map<K, Node> hashMap;
    private DoublyLinkedList queue;

    public LRUCacheImpl(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        hashMap = new HashMap<>();
        queue = new DoublyLinkedList();
    }

    public void printQ() {
        Node front = queue.front;
        while (front != null) {
            System.out.print(front.key + " ");
            front = front.next;
        }
        System.out.println();
    }

    public V get(K key) {
        Node node = hashMap.get(key);
        if (node == null) {
            return null;
        } else {
            queue.moveNodeToFront(node);
        }
        return node.value;
    }

    public void put(K key, V value) {
        Node currentNode = hashMap.get(key);
        if (currentNode != null) {
            currentNode.value = value;
            queue.moveNodeToFront(currentNode);
            return;
        }
        if (size == capacity) {
            K rearNodeKey = queue.getRearKey();
            hashMap.remove(rearNodeKey);
            queue.removeNodeFromRear();
            size--;
        }

        Node node = new Node(key, value);
        queue.addNodeToFront(node);
        hashMap.put(key, node);
        size++;
    }

    private class Node {
        K key;
        V value;
        Node next, prev;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            next = prev = null;
        }
    }

    private class DoublyLinkedList {
        private Node front, rear;

        public DoublyLinkedList() {
            front = rear = null;
        }

        public void addNodeToFront(Node node) {
            if (front == null) {
                front = rear = node;
                return;
            }
            node.next = front;
            front.prev = node;
            front = node;
        }

        public void moveNodeToFront(Node node) {
            if (front == node)
                return;
            if (rear == node) {
                rear = rear.prev;
                rear.next = null;
            } else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
            node.next = front;
            front.prev = node;
            front = node;
        }

        public void removeNodeFromRear() {
            if (rear == null)
                return;
            rear = rear.prev;
            rear.next = null;
        }

        public K getRearKey() {
            if (rear == null)
                return null;
            return rear.key;
        }
    }

    public static void main(String[] args) {
        LRUCacheImpl<String, Integer> lruCache = new LRUCacheImpl<>(3);
        lruCache.put("key 1", 10);
        lruCache.put("key 2", 20);
        lruCache.put("key 3", 62);
        lruCache.put("key 4", 23);
        lruCache.put("key 5", 524);

        System.out.println(lruCache.get("key 1"));
        System.out.println(lruCache.get("key 3"));
        lruCache.printQ();
    }
}
