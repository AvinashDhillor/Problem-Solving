import java.util.*;

public class XorPer {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    
    private static class Pair {
        int a, b;
        public Pair(int a, int b) {
            this.a   = a;
            this.b  = b;
        }

        public String toString() {
            return "["+a + ","+b+"]";
        }
    }

    static void solution() throws Exception {
         int t = sc.nextInt();
         while(t-- > 0) {
            int num = sc.nextInt();
            int[] arr = new int[num + 1];
            TreeMap<Integer, List<Pair>> map = new TreeMap<>();
            for(int i = 1; i <= num; i++) arr[i] = i;
            for(int i = 2; i <= num; i+=2) {
                int xor = (arr[i] ^ arr[i-1]);
                if(!map.containsKey(xor)) {
                    map.put(xor, new ArrayList<Pair>());
                } 
                map.get(xor).add(new Pair(arr[i], arr[i-1]));
            }
            String result = "";
            for(Map.Entry<Integer, List<Pair>> en : map.entrySet()) {
                 System.out.print(en.getKey() + " ");
                for(Pair p : en.getValue()) {
                    System.out.print(p);
                     result += p.a + " ";
                     result += p.b + " ";
                }
                 System.out.println();
            }
            if(num % 2 != 0) {
                if(map.lastKey() == num ) {
                    sb.append(
                        "-1"
                    );
                }  else {
                    sb.append(result + num);
                }
            } else {
                sb.append(result);
            }
            sb.append("\n");
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