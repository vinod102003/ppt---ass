import java.util.Arrays;

public class MinimumScore {
    public static int minScore(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int minScore = nums[n - 1] - nums[0];
        
        for (int i = 1; i < n; i++) {
            int maxNum = Math.max(nums[i - 1] + k, nums[n - 1] - k);
            int minNum = Math.min(nums[0] + k, nums[i] - k);
            
            minScore = Math.min(minScore, maxNum - minNum);
        }
        
        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minScore(nums, k);
        System.out.println("Minimum score: " + minScore);
    }
}
