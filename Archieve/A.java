import java.util.*;
import java.lang.*;
import java.io.*;

class customInt {
    int a, b;

    customInt(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Main {
    final static int mod = (int) (1e9 + 7.0);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        customInt a = new customInt(10, 20);
        print(a.a + "\n");

        sc.close();
    }

    static void print(Object s) {
        System.out.print(s);
    }
}
