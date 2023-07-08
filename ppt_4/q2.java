import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RelativeComplementArrays {
    public static List<List<Integer>> findRelativeComplement(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        List<Integer> complement1 = new ArrayList<>();
        List<Integer> complement2 = new ArrayList<>();
        
        for (int num : set1) {
            if (!set2.contains(num)) {
                complement1.add(num);
            }
        }
        
        for (int num : set2) {
            if (!set1.contains(num)) {
                complement2.add(num);
            }
        }
        
        result.add(complement1);
        result.add(complement2);
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        
        List<List<Integer>> complement = findRelativeComplement(nums1, nums2);
        System.out.println("Complement: " + complement);
    }
}
