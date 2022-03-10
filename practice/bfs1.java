import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void dfsUtil(List<List<Integer>> list, int src, boolean[] visited) {
        print(src + " ");
        visited[src] = true;
        for(int i : list.get(src)) {
            if(!visited[i]) {
                dfsUtil(list, i, visited);
            }
        }
    }

    static void dfs(List<List<Integer>> list, int src) {
        boolean[] visited = new boolean[list.size()];
        Arrays.fill(visited, false);
        dfsUtil(list, src, visited);
    }

    static void bfs(List<List<Integer>> list, int src) {
        Deque<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[list.size()];
        queue.add(src);
        visited[src] = true;

        while(!queue.isEmpty()) {
            int u = queue.poll();
            print(u + " ");
            for(int i : list.get(u)) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i); 
                }
            }
        }
    } 

    static void solution() throws Exception {
        List<List<Integer>> list = new ArrayList<>();
        int nodes = sc.nextInt();
        for(int i = 0; i < 12; i++) {
            list.add(new ArrayList<Integer>());
        }

        int tmpnodes = nodes;
        while(tmpnodes-- > 0) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            list.get(u).add(v);
        }

        bfs(list, 0);
        print(endl);
        dfs(list, 0);
    } 

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        sb = new StringBuilder();
        solution();
        print(sb);
        sc.close(); 

       
    }

    static void print(Object s) {
        System.out.print(s);
    } 
}