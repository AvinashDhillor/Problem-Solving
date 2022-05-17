
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    static int countNumberOfNodes = 0;
    static int numberOfLevels = 0;
    static int maxNumberOfNodes = 0;
    static int numberOfLevelMaxNodes = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            countNumberOfNodes = 0;
            numberOfLevels = 0;
            maxNumberOfNodes = 0;
            numberOfLevelMaxNodes = 0;
            int len = Integer.parseInt(reader.readLine());
            String s = reader.readLine();
            solutionTree(s);

        }

    }

    public static void solutionTree(String s) {

        Stack<Pair> st = new Stack<>();
        List<TreeNode> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[') {
                countNumberOfNodes++;
                TreeNode node = new TreeNode(1);
                if (st.isEmpty()) {
                    st.push(new Pair(ch, node));
                    list.add(node);
                } else {
                    TreeNode par = st.peek().node;
                    par.children.add(node);
                    st.push(new Pair(ch, node));
                }
            } else {
                st.pop();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            TreeNode root = list.get(i);
            countLevel(root, 1);
        }
        System.out.print(countNumberOfNodes + " " + numberOfLevels + " ");
        int[] tmp = new int[numberOfLevels + 1];

        for (int i = 0; i < list.size(); i++) {
            TreeNode root = list.get(i);
            tmp[0]++;
            maxNodes(root, 1, tmp);
        }


        List<Integer> sol = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] > max) {
                sol.clear();
                sol.add(i);
                max = tmp[i];
            } else if (tmp[i] == max) {
                sol.add(i);
            }
        }
        System.out.println(max + " " + sol.size());
    }

    public static void maxNodes(TreeNode tree, int count, int[] tmp) {
        if (tree.children.size() == 0) {
            return;
        }
        tmp[count] += tree.children.size();
        for (TreeNode root : tree.children) {
            maxNodes(root, count + 1, tmp);
        }
    }

    public static void countLevel(TreeNode tree, int count) {
        if (tree.children.size() == 0) {
            numberOfLevels = Math.max(numberOfLevels, count);
            return;
        }

        for (TreeNode root : tree.children) {
            countLevel(root, count + 1);
        }
    }

    public static boolean countHappyTrees(TreeNode root, int nc) {

        if (root == null || root.children.size() == 0)
            return true;

        if (root.children.size() == nc) {

            ArrayList<TreeNode> children = root.children;

            for (TreeNode child : children) {
                boolean b = countHappyTrees(child, nc);
                if (b == false)
                    return false;
            }
            return true;

        } else {
            return false;
        }

    }

    static class Pair {
        Character ch;
        TreeNode node;

        Pair(Character ch, TreeNode node) {
            this.ch = ch;
            this.node = node;
        }
    }

    static class TreeNode {
        int val;

        ArrayList<TreeNode> children;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = 0;
            children = new ArrayList<>();
        }
    }

}