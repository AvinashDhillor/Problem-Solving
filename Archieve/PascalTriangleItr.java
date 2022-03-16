import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);
    static Scanner sc = null;
    static StringBuilder sb = null;
    
    static List<List<Integer>> ans = new ArrayList<>();

    
    static void util(int row, int numRows) {
        if(row == numRows) return;

        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        for(int i = 1; i < row; i++) {
            tmp.add(ans.get(row-1).get(i - 1) + ans.get(row-1).get(i));
        }
        tmp.add(1);
        ans.add(tmp);
        util(row + 1, numRows);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        ans.add(tmp);
        if(numRows == 1) return ans;
        util(1, numRows);
        return ans;
    }

    public static List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }
        list.get(0).add(1);
        if(numRows == 1) return list;
        list.get(1).add(1);
        list.get(1).add(1);

        for(int i = 2; i < numRows; i++) {
            list.get(i).add(1);
            for(int j = 0; j < i - 1; j++) {
                list.get(i).add(list.get(i - 1).get(j) + list.get(i-1).get(j + 1));

            }
            list.get(i).add(1);

        }
        return list;
    };

    static void solution() {
        double s  = time();
        List<List<Integer>> list = generate1(100000);
        /*
        for(List<Integer> tmp : list) {
            for(Integer i : tmp) {
                print(i + " ");
            }
            print("\n");
        }  */
        double e = time();
        timeDiff(s, e);

        /*
        double s1  = time();
        
        List<List<Integer>> list1 = generate1(7000);
        for(List<Integer> tmp : list) {
            for(Integer i : tmp) {
                print(i + " ");
            }
            print("\n");
        } 
        double e1 = time(); 
        timeDiff(s1, e1); 
        */
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

