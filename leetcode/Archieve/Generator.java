public class Generator {
    public static void main(String[] args) {
        int limit = 100000000;
        int startR = -100000;
        int endR = 100000;
        System.out.println(limit);
        for (int i = 0; i < limit; i++) {
            System.out.print(genRinRange(startR, endR) + " ");
        }
        System.out.println();
    }

    public static int genRinRange(int start, int end) {
        return (int) (Math.random() * (end - start)) + start;
    }
}
