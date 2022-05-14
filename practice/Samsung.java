import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Samsung {

    public static void main(String[] args) {
        String s = "[[]][[][[]]][]";
        int ans = happyTrees(s);
        System.out.println(ans);
    }

    public static int happyTrees(String s) {

        Stack<Pair> st = new Stack<>();
        List<TreeNode> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[') {
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

        return 0;
    }

    public static void display(TreeNode root) {

        if (root == null)
            return;
        System.out.println("1 - " + root.children.size());
        ArrayList<TreeNode> children = root.children;

        for (TreeNode child : children) {
            display(child);
        }
    }

}

class Pair {
    Character ch;
    TreeNode node;

    Pair(Character ch, TreeNode node) {
        this.ch = ch;
        this.node = node;
    }
}

class TreeNode {
    int val;

    ArrayList<TreeNode> children;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = 0;
        children = new ArrayList<>();
    }
}