import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        

        StringBuilder sb = new StringBuilder();
    
        
        List<Integer> list = new ArrayList<Integer>();

        while(sc.hasNext()) {
            list.add(sc.nextInt());
        }

        long count = 0;
        int limit = 100000;

        double start, end;
        start = System.nanoTime();

        for(int i = 0; i < limit; i++) {
            for(int j = i + 1; j < limit; j++) {
                if(list.get(i) + list.get(j) == 100) {
                    count++;
                }
            }
        }

        print(count + "\n");

        end = System.nanoTime();
        print((end - start)/1e9+ "\n");
        
        long co = 0;

        start = System.nanoTime();
        Collections.sort(list);
        int l = 0, r = limit;
        while(l < r) {
            if(list.get(l) + list.get(r) == 100)  {
                co++;
                l++;
                r--;
            }
            else if(list.get(l) + list.get(r)  > 100)  {
                r--;
            }  else {
                l++;
            }
        }

        
        end = System.nanoTime();
        print((end - start)/1e9 +"\n");

        print(co + "\n");

        sc.close(); 
    }

    static void print(Object s) {
        System.out.print(s);
    } 
}

