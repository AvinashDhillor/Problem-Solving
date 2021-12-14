import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

public class TargetSum {

    static boolean ans = false;
    static int target;

    static void dfs(TreeNode root, int sum) {
        if (root == null) {
            System.out.println(sum);
            if (sum == target)
                ans = true;
            return;
        }
        if (ans)
            return;

        dfs(root.left, sum + root.val);
        dfs(root.right, sum + root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right.right = new TreeNode(7);
        target = 12;
        dfs(root, 0);
        System.out.println(ans);
    }
}
