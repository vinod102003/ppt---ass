import java.util.HashSet;
import java.util.Set;

public class MaxDifferentCandies {
    public static int maxCandies(int[] candyType) {
        int maxCandiesAllowed = candyType.length / 2;
        Set<Integer> uniqueCandies = new HashSet<>();
        
        // Count the number of unique candy types
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        
        // Return the minimum of the unique candy types or the maximum allowed candies
        return Math.min(uniqueCandies.size(), maxCandiesAllowed);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxDifferentCandies = maxCandies(candyType);
        System.out.println("Maximum different candies: " + maxDifferentCandies);
    }
}
