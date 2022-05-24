import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SearlizeAndDes {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int _data) {
            this.val = _data;
        }

        public String toString() {
            return val + "";
        }
    }

    public SearlizeAndDes() {
        createTree();
    }

    private TreeNode root;

    public void createTree() {
        root = new TreeNode(1);
        // root.left = new TreeNode(2);
        // root.right = new TreeNode(3);
        // root.right.left = new TreeNode(4);
        // root.right.right = new TreeNode(5);
    }

    List<String> list = new ArrayList<>();

    public String serialize() {
        return serialize(root);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queueOne = new LinkedList<>();
        Queue<TreeNode> queueTwo = new LinkedList<>();

        String result = "";
        queueOne.add(root);
        while (true) {
            boolean flag = false;
            String stage = "";
            while (!queueOne.isEmpty()) {
                TreeNode tmp = queueOne.poll();
                if (tmp != null)
                    flag = true;
                if (tmp == null) {
                    stage += "NULL#";
                    queueTwo.add(null);
                    queueTwo.add(null);
                } else {
                    stage += tmp.val + "#";
                    queueTwo.add(tmp.left);
                    queueTwo.add(tmp.right);
                }
            }

            if (!flag)
                return result;
            result += stage + "|";
            queueOne.clear();
            queueOne.addAll(queueTwo);
            System.out.println(queueOne.toString());
            queueTwo.clear();
        }
    }

    // Decodes your encoded val to tree.
    public TreeNode deserialize(String val) {
        String[] allNodes = val.split("\\|");
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> anotherQueue = new LinkedList<>();
        TreeNode actualRoot = null;
        if (allNodes.length == 1) {
            return new TreeNode(Integer.valueOf(allNodes[0].split("#")[0]));
        }
        for (int i = 0; i < allNodes.length - 1; i++) {
            String[] child = allNodes[i].split("#");
            System.out.println(Arrays.toString(child));
            for (int j = 0; j < child.length; j++) {
                if (child[i].equals("NULL")) {
                    queue.add(null);
                } else {
                    queue.add(new TreeNode(Integer.valueOf(child[i])));
                }
            }

            String[] anotherChild = allNodes[i + 1].split("#");
            for (int j = 0; j < anotherChild.length; j++) {
                TreeNode parent = queue.poll();
                if (actualRoot == null)
                    actualRoot = parent;
                if (child[j].equals("NULL")) {
                    anotherQueue.add(null);
                } else {
                    TreeNode abc = new TreeNode(Integer.valueOf(child[j]));
                    anotherQueue.add(abc);
                    parent.left = abc;
                }
                j++;
                if (child[j].equals("NULL")) {
                    anotherQueue.add(null);

                } else {
                    TreeNode abc = new TreeNode(Integer.valueOf(child[j]));
                    parent.right = abc;
                    anotherQueue.add(abc);
                }
            }
            queue.clear();
            queue.addAll(anotherQueue);
            anotherQueue.clear();

        }
        return actualRoot;
    }

    public static void main(String[] args) {
        SearlizeAndDes sd = new SearlizeAndDes();
        String result = sd.serialize();
        String[] nodes = result.split("\\|");
        System.out.println(Arrays.toString(nodes));

        System.out.println(sd.deserialize(result).val);

        Integer num = -1 * (int) (1e9);
        System.out.println(num);
    }
}
