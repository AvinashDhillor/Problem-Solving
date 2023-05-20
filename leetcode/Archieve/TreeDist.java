import java.util.Arrays;
import java.util.Scanner;

/**
 * TreeDist
 */
public class TreeDist {

    static class Node {
        int data;
        Node parent;
        int parentMax = 0;
        Node left, right;

        public Node(int data, Node parent) {
            this.data = data;
            this.parent = parent;
            left = right = null;
        }
    }

    static void tr(Node root) {
        if (root == null)
            return;
        tr(root.left);
        System.out.println(root.data + " ");
        tr(root.right);
    }

    static int calDistance(Node root, int[] dist, int[] leftDist, int[] rightDist) {
        if (root == null) {
            return -1;
        }

        int leftD = calDistance(root.left, dist, leftDist, rightDist);
        int rightD = calDistance(root.right, dist, leftDist, rightDist);
        dist[root.data] = Math.max(leftD, rightD) + 1;
        leftDist[root.data] = leftD + 1;
        rightDist[root.data] = rightD + 1;

        return dist[root.data];
    }

    static int giveParentMax(Node root, int[] leftmax, int[] rightmax) {
        Node parent = root.parent;
        if (parent == null)
            return 0;
        if (root == parent.left) {
            return Math.max(rightmax[parent.data] + 1, root.parentMax + 1);
        } else
            return Math.max(leftmax[parent.data] + 1, root.parentMax + 1);
    }

    static int giveChildMax(Node root, int[] dist) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        if (root.left == null) {
            return dist[root.right.data] + 1;
        }
        if (root.right == null) {
            return dist[root.left.data] + 1;
        }
        return Math.max(dist[root.left.data], dist[root.right.data]) + 1;
    }

    static int giveCommonMax(Node root, int[] dist, int[] leftMax, int[] rightmax) {
        int parMax = giveParentMax(root, leftMax, rightmax);
        int childMax = giveChildMax(root, dist);
        System.out.println(parMax + " " + childMax);
        return Math.max(parMax, childMax);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int V = N - 1;
        Node[] arr = new Node[N + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Node(i, null);
        }
        while (V-- > 0) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            if (arr[u].left == null) {
                arr[u].left = arr[v];
            } else {
                arr[u].right = arr[v];
            }
            arr[v].parent = arr[u];
        }

        int[] dist = new int[N + 1];
        int[] leftDist = new int[N + 1];
        int[] rightDist = new int[N + 1];

        calDistance(arr[1], dist, leftDist, rightDist);

        for (int i = 1; i <= N; i++)
            calParentMax(arr[i], leftDist, rightDist);
        System.out.println(Arrays.toString(dist));
        System.out.println(Arrays.toString(leftDist));
        System.out.println(Arrays.toString(rightDist));

        for (int i = 1; i <= N; i++) {
            System.out.println("-> " + giveCommonMax(arr[i], dist, leftDist, rightDist) + " " + arr[i].parentMax);
        }

        scanner.close();
    }

    private static void calParentMax(Node node, int[] leftDist, int[] rightDist) {
        Node parent = node.parent;
        if (parent != null) {
            System.out.println(node.data + " parent is " + node.parent.data);
            node.parentMax = Math.max(leftDist[parent.data], rightDist[parent.data]);
            System.out.println("Node -> " + node.parentMax);
        }
    }
}