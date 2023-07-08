import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count the frequency of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int longestSubsequence = 0;
        
        // Check each number in the map
        for (int num : countMap.keySet()) {
            if (countMap.containsKey(num + 1)) {
                int currentSubsequence = countMap.get(num) + countMap.get(num + 1);
                longestSubsequence = Math.max(longestSubsequence, currentSubsequence);
            }
        }
        
        return longestSubsequence;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int longestSubsequence = findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: " + longestSubsequence);
    }
}
