import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);

    static List<Integer> randomGenerate(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add((int)(Math.random() * (101  - 0) + 0));
        }
        return list;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        FileWriter fw  = new FileWriter("abc.txt");
        
        for(Integer i : randomGenerate(10000000)) {
            fw.write(i + "\n");
        }

        fw.close();

        print("Completed!\n");

        sc.close(); 
    }

    static void print(Object s) {
        System.out.print(s);
    } 
}

