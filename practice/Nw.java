import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);

    static void BFS(int src, List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        q.add(src);
        while(!q.isEmpty()) {
            int u = q.poll();
            print(u + " ");
            for(Integer i : adj.get(u)) {
                if(visited[i] == false) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
    

    static void DFS(List<List<Integer>> adj, int src) {
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        DFSUtil(adj, src, visited);
    }
    
    static void DFSUtil(List<List<Integer>> adj, int src, boolean[] visited) {
        if(visited[src]) return;
        print(src  + " ");
        visited[src] = true;
        for(Integer i : adj.get(src)) {
            if(!visited[i]) {
                DFSUtil(adj, i, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            adj.add(new ArrayList<>());
        }

        adj.add(1, (Arrays.asList(new Integer[] { 2, 3 })));
        adj.add(2, Arrays.asList(new Integer[] { 4, 5 }));
        adj.add(3, Arrays.asList(new Integer[] { 6, 8 }));
        adj.add(5, Arrays.asList(new Integer[] { 7 }));

        BFS(1, adj);
        print("\n");
        DFS(adj, 1);
        sc.close();
        print("\n"); 
        /* 
        Map<Integer, Integer> map = new TreeMap<Integer, Integer> ();

        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        map.put(5, 50);
        map.put(4, 100); 
        map.remove(4);
        print(map.containsKey(5));
        for(Map.Entry<Integer, Integer> it  : map.entrySet()) {
            print(it.getKey() + ", " + it.getValue() + "\n");
        }
            */
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        print(set.contains(100));
    }

    static void print(Object s) {
        System.out.print(s);
    }
}

