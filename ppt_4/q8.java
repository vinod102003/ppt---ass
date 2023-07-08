import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[n + i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] shuffledArray = shuffle(nums, n);
        System.out.println("Shuffled array: " + Arrays.toString(shuffledArray));
    }
}
