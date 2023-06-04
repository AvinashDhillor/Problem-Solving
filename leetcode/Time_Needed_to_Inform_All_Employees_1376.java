import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Time_Needed_to_Inform_All_Employees_1376
 */
public class Time_Needed_to_Inform_All_Employees_1376 {
    static int sum = 0;

    public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] arr = new ArrayList[n];

        for (int i = 0; i < manager.length; i++) {
            arr[manager[i]].add(i);
        }

        cal(arr, headID, informTime);

        System.out.println(Arrays.toString(arr));

        return sum;
    }

    private static void cal(List<Integer>[] arr, int headID, int[] informTime) {
        sum += informTime[headID];
        for (int i : arr[headID]) {
            cal(arr, i, informTime);
        }
    }

}