import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    
    public static class Pair{
        int i;
        int j;
        String psf;

        public Pair(int i, int j, String psf){
            this.i = i;
            this.j = j;
            this.psf = psf;
        }

        public Pair() {

        }

        public void setPair(int i, int j, String psf){
            this.i = i;
            this.j = j;
            this.psf = psf;
        }

    }
    
    public static int find(String s1, String s2, int[] masses, int tMass){
        String[] l = s1.split(" ");
        String[] r = s2.split(" ");
        int i=0,j=0;

        int total = 0;
        while(i<l.length && j<r.length){
            int idx1 = Integer.parseInt(l[i]);
            int idx2 = Integer.parseInt(r[j]);
            
            if(idx1!=idx2){
                if(idx1<idx2){
                    total += masses[idx1];
                    i++;
                }else{
                    total += masses[idx2];
                    j++;
                }
            }else{
                total += masses[idx1];
                i++;j++;
            }
        }
        
        while(i<l.length){
            int idx1 = Integer.parseInt(l[i]);
            total += masses[idx1];
            i++;   
        }
        
        while(j<r.length){
            int idx2 = Integer.parseInt(r[j]);
            total += masses[idx2];
            j++;
        }
        
        return tMass - total;
    }
    
    public static int solution(ArrayList<String> d1, ArrayList<String> d2, int[] masses, int tMass){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<d1.size();i++){
            for(int j=0;j<d2.size();j++){
                String s1 = d1.get(i);
                String s2 = d2.get(j);
                int ans = find(s1,s2,masses,tMass);
                min = Math.min(min,ans);
            }
        }
        return min;
    }
    
    public static int solve(int w1, int w2, int[] masses){
        int tMass = 0;
        int n = masses.length;
        int w = Math.max(w1,w2);
        int[][] dp = new int[n+1][w+1];
        
        for(int i : masses){
            tMass += i;
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0) dp[i][j]=0;
                else{
                    int mass = masses[i-1];
                    if(j>=mass){
                        dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-mass] + mass);
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        
        int maxD1 = dp[n][w1];
        int maxD2 = dp[n][w2];
        
        ArrayDeque<Pair> que = new ArrayDeque<>();
        Pair par = new Pair();
        par.setPair(n,maxD1,"");
        que.add(par);
        ArrayList<String> d1 = new ArrayList<>();
        while(que.size()>0){
            Pair rem = que.remove();
            
            if(rem.j==0){
                d1.add(rem.psf);
            }else{
                int mass = masses[rem.i-1];
                
                if( (rem.j>=mass) ){
                    que.add(new Pair(rem.i-1,rem.j-mass,(rem.i-1)+" "+rem.psf));
                }
                
                if(dp[rem.i-1][rem.j]==dp[rem.i][rem.j]){
                    que.add(new Pair(rem.i-1,rem.j,rem.psf));
                }
            } 
        }
        
        ArrayList<String> d2 = new ArrayList<>();
        que = new ArrayDeque<>();
        que.add(new Pair(n,maxD2,""));
        
        while(que.size()>0){
            Pair rem = que.remove();
            
            if(rem.j==0){
                d2.add(rem.psf);
            }else{
                int mass = masses[rem.i-1];
                
                if( (rem.j>=mass) ){
                    que.add(new Pair(rem.i-1,rem.j-mass,(rem.i-1)+" "+rem.psf));
                }
                
                if(dp[rem.i-1][rem.j]==dp[rem.i][rem.j]){
                    que.add(new Pair(rem.i-1,rem.j,rem.psf));
                }
            } 
        }
        
        int ans = solution(d1,d2,masses,tMass);
        return ans;
    }
    
    public static void main(String[] args) {
        int w1,w2;
        Scanner sc = new Scanner(System.in);
        w1 = sc.nextInt();
        w2 = sc.nextInt();

        int size;
        size = sc.nextInt();
        
        int[] masses = new int[size];

        for(int i =0; i< size; i++) {
            masses[i] = sc.nextInt();
        }
        
        int ans = solve(w1,w2,masses);
        System.out.println(ans);
    }
}