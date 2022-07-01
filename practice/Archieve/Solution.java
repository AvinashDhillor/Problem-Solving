import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {

    private static class Node {
        ArrayList<Node> nodes_array;
        Node(int val) {
            nodes_array = new ArrayList<>();
        }
    }

    public static int happyTrees(String s, int len) {

        Stack<Node> stack = new Stack<>();
        ArrayList<Node> roots = new ArrayList<>();

        for (char ch : s.toCharArray()) {

            if (ch == '[') {
                Node node = new Node(1);
                if (stack.size() == 0) {
                    stack.push(node);
                    roots.add(node);
                } else {
                    Node parent = stack.peek();
                    parent.nodes_array.add(node);
                    stack.push(node);
                }
            } else {
                stack.pop();
            }
        }

        int ans = 0;
        for (Node root : roots) {
            boolean b = CHT(root, root.nodes_array.size());
            ans += (b ? 1 : 0);
        }

        return ans;
    }

    public static boolean CHT(Node root, int nc) {

        if (root == null || root.nodes_array.size() == 0)
            return true;

        if (root.nodes_array.size() == nc) {
            ArrayList<Node> nodes_array = root.nodes_array;
            for (Node child : nodes_array) {
                if (!CHT(child, nc))
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int len = Integer.parseInt(reader.readLine());
            String s = reader.readLine();
            int ans = happyTrees(s, len);
            System.out.println(ans);
        }

    }

}