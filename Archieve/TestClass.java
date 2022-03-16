import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            int Q = Integer.parseInt(br.readLine().trim());
            int[][] queries = new int[Q][2];
            for(int i_queries = 0; i_queries < Q; i_queries++)
            {
            	String[] arr_queries = br.readLine().split(" ");
            	for(int j_queries = 0; j_queries < arr_queries.length; j_queries++)
            	{
            		queries[i_queries][j_queries] = Integer.parseInt(arr_queries[j_queries]);
            	}
            }

            int[] out_ = calcXOR(N, A, Q, queries);
            System.out.print(out_[0]);
            for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
            {
            	System.out.print(" " + out_[i_out_]);
            }
            
            System.out.println();
            
         }

         wr.close();
         br.close();
    }

    static int calodd(int n) {
        return 2 * n  - 1;
    }

    long calodd(long n) {
        return 2*n - 1;
    }


    long caleven(long n)  {
        return 2 * n;
    }

    static int caleven(int n) {
        return 2 * n;
    }

    static int[] calcXOR(int N, int[] A, int Q, int[][] queries){
       // your code here
        int[] result = new int[Q];
        int spcxor = 0;
        int[] impact = new int[N];

        List<Integer> list = new ArrayList<>();
        boolean isOdd = N % 2 == 0 ? false : true;

            int ma = N - 1;
            int ab = ma / 2;
            for(int i = ab; i >= 1; i--) {
                list.add(isOdd ? calodd(i) : caleven(i));
            }

            if(!isOdd) list.add(0);

            for(int i = 1; i <= ab; i++) {
                list.add(isOdd ? (-1) * calodd(i) : (-1) * caleven(i));
            }

        impact[0] = N - 1;

        for(int i = 1; i < N; i++) {
            impact[i] = impact[i-1] + list.get(i-1);
        }

        boolean isinv[]  = new boolean[N];

        for(int i = 0; i < N; i++) {
            if(impact[i] % 2 != 0) {
                isinv[i] = true;
                spcxor ^= A[i];
            }
        }

        for(int i = 0; i < Q; i++) {
            int index = queries[i][0] - 1;
            int value = queries[i][1];

            if(isinv[index] == false) {
                result[i] = spcxor;
            } else {
                spcxor ^= A[index];
                spcxor ^= value;
                A[index] = value;
                result[i] = spcxor;
            }
        }
        
        return result;
    
    }
}