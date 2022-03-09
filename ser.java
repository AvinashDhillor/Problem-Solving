import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    static void solution() throws Exception {
        File f = new File("zzzz.txt");
        OutputStream ops = new FileOutputStream(f);
        InputStream ips = new FileInputStream(f);
        byte[] b = new byte[5];
        for(int i = 0; i < b.length; i++) {
            b[i] = 127;
        }

        ops.write(b);

        byte[] c = new byte[5];

        print(ips.read(c));

        
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