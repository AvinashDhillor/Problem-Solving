public class Re {



    public static void main(String[] args) {
        long start = System.nanoTime();
        int limit = (int) 1e5;
        int[][] a = new int[limit][limit];
        for(int i = 0; i < limit; i++) {
            for(int j = 0; j < limit; j++) {
                a[i][j] = i * j + j;
            }
        }
        long end = System.nanoTime();
        System.out.printf("%.7f", (end- start) / 1e9);
    }
}
