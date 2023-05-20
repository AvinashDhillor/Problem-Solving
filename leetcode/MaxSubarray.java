import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaxSubarray {

    static class LogHeap implements Runnable {

        @Override
        public void run() {

            while (true) {
                long allM = Runtime.getRuntime().totalMemory();
                System.out.println("A : " + allM / 1048576);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    try {
                        throw new Exception();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            }

        }

    }

    public static int numcalls = 0;

    public static int maxSubArray(int[] nums) {
        return sol(nums, 0, nums.length - 1);
    }

    public static int sol(int[] nums, int l, int r) {
        numcalls++;
        if (l > r)
            return Integer.MIN_VALUE;
        int mid = (l + r) / 2, leftsum = 0, rightsum = 0;

        for (int i = mid - 1, cursum = 0; i >= l; i--) {
            cursum += nums[i];
            leftsum = cursum > leftsum ? cursum : leftsum;
        }

        for (int i = mid + 1, cursum = 0; i <= r; i++) {
            cursum += nums[i];
            rightsum = cursum > rightsum ? cursum : rightsum;
        }

        return Collections
                .max(Arrays.asList(sol(nums, l, mid - 1), sol(nums, mid + 1, r), leftsum + rightsum + nums[mid]));

    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        LogHeap logHeap = new LogHeap();

        Thread thread = new Thread(logHeap);

        thread.start();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("in.txt"));

        String a = bufferedReader.readLine();

        StringBuilder sb = new StringBuilder();
        char[] buffer = new char[1024];

        int read = 0;

        while ((read = bufferedReader.read(buffer, 0, buffer.length)) != -1) {
            sb.append(buffer, 0, read);
        }

        // String b = sb.toString();

        int size = Integer.valueOf(a.split(" ")[0]);

        System.out.println(size);
        int[] arr = new int[size];

        long fileReadTime = System.nanoTime();

        ArrayList<String> arr1 = new ArrayList<>();

        try {

            String tmp = "";
            for (int i = 0; i < sb.length();) {
                if (sb.charAt(i) == ' ') {
                    tmp = "";
                    i++;
                    continue;
                }
                int k = i;
                while (sb.charAt(k) != ' ') {
                    tmp += sb.charAt(k);
                    k++;
                }
                // System.out.println(arr1.size());
                arr1.add(tmp);
                i = k;
            }

        } catch (Exception e) {
            System.out.println("Reached limit");
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arr1.get(i));
        }

        long fileReadTimeEnd = System.nanoTime();
        System.out.println((fileReadTimeEnd - fileReadTime) / 1e9);

        fileReadTime = System.nanoTime();
        maxSubArray(arr);
        fileReadTimeEnd = System.nanoTime();

        System.out.println((fileReadTimeEnd - fileReadTime) / 1e9);

        System.out.println(numcalls);

        thread.interrupt();

        scanner.close();
        bufferedReader.close();

    }
}
