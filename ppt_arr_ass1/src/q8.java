import java.util.*;
public class q8 {

        public static int[] findErrorNums(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            int duplicate = -1;
            long sum = 0; // long to avoid integer overflow when calculating the sum

            // Find the duplicate number
            for (int num : nums) {
                if (set.contains(num)) {
                    duplicate = num;
                } else {
                    set.add(num);
                    sum += num;
                }
            }

            // Calculate the missing number
            int n = nums.length;
            long totalSum = (long) n * (n + 1) / 2;
            int missing = (int) (totalSum - sum);

            return new int[]{duplicate, missing};
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 4};
            int[] result = findErrorNums(nums);
            System.out.println("Duplicate: " + result[0]);
            System.out.println("Missing: " + result[1]);
        }
    }



