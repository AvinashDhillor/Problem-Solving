import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

      static  long sn(int in)
    {
        
        long n = in;
        long sum = (n * (n + 1)) / 2;
        return sum;
    }
    
    static long sr(int l, int r)
    {
        return sn(r) - sn(l - 1);
    }
 

 static long minimalKSum(int[] nums1, int k) {
        Set<Integer> st = new TreeSet<>();
        
        
        for(int i : nums1) st.add(i);
        
        st.add(0);
        
        int[] nums = new int[st.size()];
        int index = 0;
        for(int i : st) nums[index++] = i;
      
        long sum = 0;
        
        for(int i : nums) {
              System.out.print( i  + " ");
        }
        
          System.out.println();
        
         int left = 0;
         int right = 0;
        
        for(int i = 1; i < nums.length; i++) {
            left = i == 0 ? 0 : nums[i-1];
            right = nums[i];
            
            if( k - (right - left - 1 ) >= 0) {
                 k -= right - left - 1;
                 long tmp = sr(left + 1, right - 1);
                 System.out.println( right - left - 1+ " ->  " + tmp);
                 sum += tmp;
            }  else break;
            
            // for(int j = left + 1; j < right; j++) {
            //     sum += j;
            //     k--;
            //     if(k == 0) break;
            // }
            // if(k == 0) break;
        }
        print(left  + " " + right + endl) ;
        long ds= left + 1 < right ? left : right;
        while(k-- > 0) {
            sum += ds;
            ds++;
            
        }
            
        return sum;
    }
    

    static void solution() throws Exception {
        int[] a = {5, 6};
        int k =  6;
        print(minimalKSum(a, k ));


        print("this is tmp");

        print(sr(1, 16));

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