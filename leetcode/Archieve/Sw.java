import java.util.UUID;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.layout.Eades84Layout;
import org.graphstream.ui.layout.Layout;
import org.graphstream.ui.view.Viewer;

public class Sw {

    static Graph g = new SingleGraph("My Graph");

    public static int fib(int n, String prev) {
        String uuid = UUID.randomUUID().toString();
        if (prev == null) {
            addToGraph(uuid, String.valueOf(n));
        } else {
            if (g.getNode(uuid) == null) {
                addToGraph(uuid, String.valueOf(n));
            }
            addGraphEdge(uuid, prev);
        }

        if (n <= 1)
            return n;
        return fib(n - 1, uuid) + fib(n - 2, uuid);
    }

    public static void addToGraph(String a, String value) {
        g.addNode(a).setAttribute("ui.label", "Node " + value);
    }

    public static void addGraphEdge(String a, String b) {
        UUID uuid = UUID.randomUUID();
        g.addEdge(uuid.toString(), a, b);
    }

    public static void main(String[] args) {
        System.setProperty("org.graphstream.ui", "swing");

        fib(5, null);

        g.display();

    }
}
