// import java.util.HashMap;
// import java.util.Map;

// public class LRUCache<T> {
//     private final int capacity;
//     private int size;
//     private final Map<String, Node> hashmap;
//     private final DoublyLinkedList internalQueue;

//     LRUCache(final int capacity) {
//         this.capacity = capacity;
//         this.hashmap = new HashMap<>();
//         this.internalQueue = new DoubleLinkedList();
//         this.size = 0;
//     }

//     public T get(final String key) {
//         Node node = hashmap.get(key);
//         if (node == null) {
//             return null;
//         }

//         internalQueue.moveNodeToFront(node);
//         return hashmap.get(key).value;
//     }

//     public void put(final String key, final T value) {
//         Node currentNode = hashmap.get(key);

//         if (currentNode != null) {
//             currentNode.value = value;
//             internalQueue.moveNodeToFront(currentNode);
//             return;
//         }

//         if (size == capacity) {
//             String rearNodeKey = internalQueue.getRearKey();
//             internalQueue.removeNodeFromRear();
//             hashmap.remove(rearNodeKey);
//             size--;
//         }

//         Node node = new Node(key, value);
//         internalQueue.addNodeToFront(node);
//         hashmap.put(key, node);
//         size++;
//     }

//     private class Node {
//         String key;
//         T value;
//         Node next, prev;

//         Public Node(final String key, final T value) {
//             this.key = key;
//             this.value = value;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     private class DoubleLinkedList {
//         private Node front, rear;

//         public DoubleLinkedList() {
//             front = rear = null;
//         }

//         private void addNodeToFront(final Node node) {
//             if (rear == null) {
//                 front = rear = node;
//                 return;
//             }

//             node.next = front;
//             front.prev = node;
//             front = node;
//         }

//         private void moveNodeToFront(final Node node) {
//             if (front == node)
//                 return;

//             if (node == rear) {
//                 rear = rear.prev;
//                 rear.next = null;
//             } else {
//                 node.prev.next = node.next;
//                 node.next.prev = node.prev;
//             }

//             node.prev = null;
//             node.next = front;
//             front.prev = node;
//             front = node;
//         }

//         private void removeNodeFromRear() {
//             if (rear == null)
//                 return;

//             System.out.println("Deleting key : " + rear.key);

//             if (front == rear) {
//                 front = rear = null;
//             } else {
//                 rear = rear.prev;
//                 rear.next = null;
//             }
//         }

//         private String getRearKey() {
//             return rear.key;
//         }
//     }

//     public static void main(String[] args) {
//         LRUCache<Integer> lruCache = new LRUCache<>(5);
//         lruCache.put("key 1 ", 10);
//         lruCache.put("key 2 ", 20);
//         lruCache.put("key 3 ", 62);
//         lruCache.put("key 4 ", 23);
//         lruCache.put("key 5", 524);
//     }
// }

import java.util.HashMap;
import java.util.Map;

public class LRUCache<T> {

    private final int capacity;
    private int size;
    private final Map<String, Node> hashmap;
    private final DoublyLinkedList internalQueue;

    LRUCache(final int capacity) {
        this.capacity = capacity;
        this.hashmap = new HashMap<>();
        this.internalQueue = new DoublyLinkedList();
        this.size = 0;
    }

    public T get(final String key) {
        Node node = hashmap.get(key);
        if (node == null) {
            return null;
        }
        internalQueue.modeNodeToFront(node);
        return hashmap.get(key).value;
    }

    public void put(final String key, final T value) {
        Node currentNode = hashmap.get(key);
        if (currentNode != null) {
            currentNode.value = value;
            internalQueue.modeNodeToFront(currentNode);
            return;
        }

        if (size == capacity) {
            String rearNodeKey = internalQueue.getRearKey();
            internalQueue.removeNodeFromRear();
            hashmap.remove(rearNodeKey);
            size--;
        }

        Node node = new Node(key, value);
        internalQueue.addNodeToFront(node);
        hashmap.put(key, node);
        size++;
    }

    private class Node {
        String key;
        T value;
        Node next, prev;

        public Node(final String key, final T value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private class DoublyLinkedList {
        private Node front, rear;

        public DoublyLinkedList() {
            front = rear = null;
        }

        private void addNodeToFront(final Node node) {
            if (rear == null) {
                front = rear = node;
                return;
            }
            node.next = front;
            front.prev = node;
            front = node;
        }

        public void modeNodeToFront(final Node node) {
            if (front == node) {
                return;
            }

            if (node == rear) {
                rear = rear.prev;
                rear.next = null;
            } else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }

            node.prev = null;
            node.next = front;
            front.prev = node;
            front = node;
        }

        private void removeNodeFromRear() {
            if (rear == null) {
                return;
            }

            System.out.println("Deleting key: " + rear.key);
            if (front == rear) {
                front = rear = null;
            } else {
                rear = rear.prev;
                rear.next = null;
            }
        }

        private String getRearKey() {
            return rear.key;
        }

    }

    public static void main(String[] args) {
        LRUCache<Integer> lruCache = new LRUCache<>(3);
        lruCache.put("key 1", 10);
        lruCache.put("key 2", 20);
        lruCache.put("key 3", 62);
        lruCache.put("key 4", 23);
        lruCache.put("key 5", 524);

        System.out.println(lruCache.get("key 1"));
        System.out.println(lruCache.get("key 4"));
    }
}