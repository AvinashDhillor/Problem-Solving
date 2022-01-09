import java.util.*;
import java.lang.*;
import java.io.*;



public class BitsCount {

    final static int mod = (int) (1e9 + 7.0);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[] {0,1,2,3,4,5,6,7,8};
    
        Integer[] ar = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(ar, (a, b) -> {
            if(Integer.bitCount(a) == Integer.bitCount(b)) return a - b;
            return Integer.bitCount(a) - Integer.bitCount(b);
        });

        for(Integer i : ar) {
            print(i + " ");
        }

        sc.close(); 
    }

    static void print(Object s) {
        System.out.print(s);
    } 
}

