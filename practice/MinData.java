import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class MinData {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {
        String current = "02:30"; // 11:30
        String goal = "02:31"; // 9:35

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date d1 = format.parse(current);
        Date d2 = format.parse(goal);
        long diff = d2.getTime() - d1.getTime();
        long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);

        int op = 0;

        while (minutes > 0) {
            if (minutes >= 60) {
                minutes -= 60;
            } else if (minutes >= 15) {
                minutes -= 15;
            } else if (minutes >= 5) {
                minutes -= 5;
            } else {
                minutes -= 1;
            }
            op++;
        }

        print(op + endl);
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