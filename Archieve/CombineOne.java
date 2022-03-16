import java.util.*;
import java.lang.*;
import java.io.*;

class Main { 
    final static int mod = (int) (1e9 + 7.0);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

    
        //Consume all ram
        
        int limit = 100000;
        long[][] arr = new long[limit][limit];
        
        for(int i = 0; i < limit; i++) {
            for(int j = 0; j < limit; j++) {
                arr[i][j] = Long.MAX_VALUE;
            }
        } 


        sc.close(); 

    }

    static void print(Object s) {
        System.out.print(s);

    } 
}


