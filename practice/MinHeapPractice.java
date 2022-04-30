import java.util.HexFormat;

public class MinHeapPractice {
    private int[] heap;
    private int size;
    private int capacity;
    private static int front = 1;

    public MinHeapPractice(int maxSize) {
        this.capacity = maxSize;
        this.size = 0;
        heap = new int[maxSize + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return pos * 2;
    }

    private int rightChild(int pos) {
        return pos * 2 + 1;
    }

    private void swap(int one, int two) {
        int tmp = heap[one];
        heap[one] = heap[two];
        heap[two] = tmp;
    }

    private boolean isLeaf(int pos) {
        if (pos > size / 2 && pos <= size)
            return true;
        return false;
    }

    private void heapify(int pos) {
        if (!isLeaf(pos)) {
            if (heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)]) {
                if (heap[leftChild(pos)] < heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    heapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    heapify(rightChild(pos));
                }
            }
        }
    }

    private void insert(int element) {
        if (size > capacity)
            return;
        heap[++size] = element;
        int current = size;
        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {

            // Printing the parent and both childrens
            System.out.print(
                    " PARENT : " + heap[i]
                            + " LEFT CHILD : " + heap[2 * i]
                            + " RIGHT CHILD :" + heap[2 * i + 1]);

            // By here new line is required
            System.out.println();
        }
    }

    public int remove() {
        int min = heap[front];
        heap[front] = heap[size--];
        heapify(front);
        return min;
    }

    public static void main(String[] args) {
        System.out.println("The Min heap is ");

        // Creating object opf class in main() methodn
        MinHeapPractice minheap = new MinHeapPractice(15);

        // Inserting element to minheap
        // using insert() method

        // Custom input entries
        minheap.insert(5);
        minheap.insert(3);
        minheap.insert(17);
        minheap.insert(10);
        minheap.insert(84);
        minheap.insert(19);
        minheap.insert(6);
        minheap.insert(22);
        minheap.insert(9);

        while (minheap.size != 0) {
            System.out.println(minheap.remove());
        }
    }
}
