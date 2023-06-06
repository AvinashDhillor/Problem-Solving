/**
 * Can_Make_Arithmetic_Progression_From_Sequence_1502
 */
public class Can_Make_Arithmetic_Progression_From_Sequence_1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (diff != arr[i] - arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}