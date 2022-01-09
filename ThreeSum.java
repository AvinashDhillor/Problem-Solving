import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("abc.txt");
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(fr);
        

        StringBuilder sb = new StringBuilder();
    
        
        while(sc.hasNext()) {
            print(sc.nextInt() + "\n");
        }

        sc.close(); 
    }

    static void print(Object s) {
        System.out.print(s);
    } 
}

