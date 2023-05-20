import java.util.UUID;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

public class Visualize {

    public Visualize() {
        // String style = "node { text-size: 50; }";

        // this.g.setAttribute("ui.stylesheet", style);
    }

    static Graph g = new SingleGraph("My Graph");

    public static void addNodeToGraph(String a, String value) {
        g.addNode(a).setAttribute("ui.label", "Node " + value);
    }

    public static boolean containsNode(String id) {
        return g.getNode(id) != null;
    }

    public static void addEdgeToGraph(String a, String b) {
        UUID uuid = UUID.randomUUID();
        g.addEdge(uuid.toString(), a, b);
    }

    public static void display() {
        System.setProperty("org.graphstream.ui", "swing");
        String style = "node { text-size: 16; }";
        g.setAttribute("ui.stylesheet", style);
        g.display();
        System.out.println(nodesCount());
    }

    public static int nodesCount() {
        return g.getNodeCount();
    }
}
