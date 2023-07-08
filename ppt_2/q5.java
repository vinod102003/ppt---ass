import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static int maximumProduct(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int n = nums.length;
        
        // Check the product of the three largest numbers and the two smallest numbers with the largest magnitude
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];
        
        // Return the maximum product
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int maxProduct = maximumProduct(nums);
        System.out.println("Maximum product: " + maxProduct);
    }
}
