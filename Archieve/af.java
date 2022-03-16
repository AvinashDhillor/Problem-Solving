import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static long find(long n){
        double k = ( -1.0 + Math.sqrt(1 + 8*n))/2;

        if(Math.ceil(k)==Math.floor(k)){
            return (long)k;
        }else{
            return -1;
        }
    }
    
    static int math_pairs(long N){
       // Return total valid pairs
        if(N==1) return 1;
        int result = 0;
    
        for(int i=1;i<=(N);i++){
            long left = (i*(i-1))/2;
            long check = ((2*left) + i);
            long ans = find(check);
            if(ans!=-1 && ans<=N && ans>=i){
                result += 1;
            }
        }
        return result;
    }

    long calodd(long n) {
        return 2*n - 1;
    }

    long caleven(long n)  {
        return 2 * n;
    }


    vector<long> calcXOR(int N, vector<int> A, int Q, vector<vector<int>> queries) {
        vector<long> result(Q);

        long spcxor = 0;
        vector<long> impact(N);

        vector<long> list;
        boolean isOdd = N % 2 == 0 ? false : true;

            int ma = N - 1;
            int ab = ma / 2;
            for(int i = ab; i >= 1; i--) {
                list.push_back(isOdd ? calodd(i) : caleven(i));
            }

            if(!isOdd) list.push_back(0);

            for(int i = 1; i <= ab; i++) {
                list.push_back(isOdd ? (-1) * calodd(i) : (-1) * caleven(i));
            }

        impact[0] = N - 1;

        for(int i = 1; i < N; i++) {
            impact[i] = impact[i-1] + list[i-1];
        }


        vector<bool> isinv(N);

        for(int i = 0; i < N; i++) {
            if(impact[i] % 2 != 0) {
                isinv[i] = true;
                spcxor ^= A[i];
            }
        }

        for(int i = 0; i < Q; i++) {
            long index = queries[i][0] - 1;
            long value = queries[i][1];

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

    static void solution() throws Exception {
        Map<Integer, Integer> map = new TreeMap<>();

        

         for(int i = 1;  i <= 100000; i++) {
             //print(math_pairs(i) +  endl);
             int tmp = math_pairs(i);
             int ab = map.getOrDefault(tmp, 0)+ 1;
             map.put(tmp, ab);
         }

         for(Map.Entry<Integer, Integer> ent : map.entrySet()) {
             print(ent.getKey() + ", " + ent.getValue() + endl);
         }


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