import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Paretn extends Visualize {
    static List<String> solList = new ArrayList<>();

    public static void util(int opened, int closed, String sol, int n, String prev) {
        String id = UUID.randomUUID().toString();
        if (!containsNode(id)) {
            addNodeToGraph(id, sol);
            addEdgeToGraph(prev, id);
        }

        if (sol.length() / 2 > n || closed > n || opened > n)
            return;
        if (opened == n && opened == closed) {
            solList.add(sol);
        }
        if (closed > opened)
            return;
        if (opened == 0) {
            util(opened + 1, closed, "(", n, id);
            return;
        }
        if (closed < opened)
            util(opened, closed + 1, sol + ")", n, id);

        if (closed < n)
            util(opened + 1, closed, sol + "(", n, id);
    }

    public static List<String> generateParenthesis(int n) {
        util(0, 0, "", n, "Start");
        return solList;
    }

    public static void main(String[] args) {
        g.addNode("Start").setAttribute("ui.label", "NODE START HERE");
        System.out.println(generateParenthesis(3));
        System.out.println(nodesCount());
        display();
    }
}
