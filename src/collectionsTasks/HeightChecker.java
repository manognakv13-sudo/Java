
import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {

        // Create a copy of original array
        int[] expected = heights.clone();

        // Sort the copied array
        Arrays.sort(expected);

        // Count mismatches
        int count = 0;

        for (int i = 0; i < heights.length; i++) {

            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] heights = {1, 1, 4, 2, 1, 3};

        int result = heightChecker(heights);

        System.out.println("Output: " + result);
    }
}
