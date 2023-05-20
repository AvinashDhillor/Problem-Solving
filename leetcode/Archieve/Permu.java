import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Permu extends Visualize {

    static List<List<Integer>> sol = new ArrayList<>();

    static void util(int[] nums, List<Integer> list, Set<Integer> set, String prev) {

        if (list.size() > nums.length) {
            return;
        }

        if (list.size() == nums.length) {
            sol.add(new ArrayList<>(list));
        }

        String id = UUID.randomUUID().toString();
        if (!containsNode(id)) {
            addNodeToGraph(id, list.toString());
            addEdgeToGraph(prev, id);
        }

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(i))
                continue;
            list.add(nums[i]);
            set.add(i);
            util(nums, list, set, prev);
            list.remove(list.size() - 1);
            set.remove(i);
            // util(nums, list, set, prev);
        }

    }

    static List<List<Integer>> permute() {
        int n = 3;
        int[] nums = new int[] { 1, 2, 3 };

        util(nums, new ArrayList<>(), new HashSet<>(), "START");

        return sol;
    }

    public static void main(String[] args) {
        display();
        g.addNode("START").setAttribute("ui.label", "Node Start Here");
        System.out.println(permute());
    }
}
