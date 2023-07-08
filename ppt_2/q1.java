import java.util.Arrays;

public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        int maxSum = 0;
        // Iterate over the array, considering every second element starting from index 0
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int maxSum = arrayPairSum(nums);
        System.out.println("Maximum sum: " + maxSum);
    }
}
