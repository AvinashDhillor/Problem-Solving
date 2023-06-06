import java.util.ArrayList;
import java.util.List;

/**
 * Time_Needed_to_Inform_All_Employees_1376
 */
public class Time_Needed_to_Inform_All_Employees_1376 {
    int maxTime = Integer.MIN_VALUE;

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] arr = new ArrayList[n];

        for (int i = 0; i < n; i++)
            arr[i] = new ArrayList<Integer>();

        for (int i = 0; i < manager.length; i++) {
            if (manager[i] == -1)
                continue;
            arr[manager[i]].add(i);
        }

        cal(arr, headID, informTime, 0);

        return maxTime;
    }

    private void cal(List<Integer>[] arr, int headID, int[] informTime, int time) {
        maxTime = Math.max(maxTime, time);

        for (int i : arr[headID]) {
            cal(arr, i, informTime, time + informTime[headID]);
        }
    }
}