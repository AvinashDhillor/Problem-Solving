public class Prims {

    private class Edge implements Comparable<Edge> {
        int v, w, weight;

        public Edge(int v, int w, double weight) {

        }

        double weight() {
            return weight;
        }

        int either() {
            return v;
        }

        int other(int v) {
            return w;
        }

        public int compareTo(Edge that) {
            return this.w - that.w;
        }

        public String toString() {
            return "Weight " + w + " ";
        }
    }
}