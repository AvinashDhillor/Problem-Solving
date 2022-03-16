import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);
    static Scanner sc = null;
    static StringBuilder sb = null;
    
    static Set<String> set;
    static boolean[] dp;

    // Backtracking 
    static boolean util(String s, int pos) {
        if(pos == s.length()) return true;

        if(dp[pos]) return true;

        String t = "";
        for(int i = pos; i < s.length(); i++) {
            if(set.contains(s.substring(pos, i + 1)) && util(s, i + 1)) {
                dp[pos] = true;
                return true;
            }
        }
        dp[pos] = false;
        return false;
    }

    static boolean wordBreak(String s, List<String> wordDict) {
        set = new HashSet<String>(wordDict);
        dp = new boolean[s.length()+1];
        return util(s, 0);
    }

    static void solution() {
        // solution code
        String s = "leetcode";
        List<String> wordDict = new ArrayList<String>();

        wordDict.add("code");
        wordDict.add("ab");
    
        print(wordBreak(s, wordDict));
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        sb = new StringBuilder();
    
        solution();
        print(sb);

        sc.close(); 
    }

    static void print(Object s) {
        System.out.print(s);
    } 

    static double time() {
        return System.nanoTime();
    }

    static void timeDiff(double startTime, double endTime) {
        double divideby = 1e9;
        double diff = (endTime - startTime)/divideby;
        print("\nTime Taken : " + diff + " sec\n");
    }

}

class Pair implements Comparator<Pair>, Comparable<Pair> {
    public int first, second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int compare(Pair p1, Pair p2) {
        if(p1.first == p2.first) 
            return p1.second - p2.second;
        return p1.first - p2.first;
    }

    public int compareTo(Pair p1) {
        if(this.first == p1.first)
            return this.second - p1.second;
        return this.first - p1.first;
    }

    public String toString() {
        return "["+first+", "+second+"]";
    }
}

