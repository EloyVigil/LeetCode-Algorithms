import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1; // This can be adjusted as needed
    }

    public static void main(String[] args) {
        testSingleNumber();
    }

    public static void testSingleNumber() {
        int[][] testCases = {
            {2, 2, 1}, // Expected: 1
            {4, 1, 2, 1, 2}, // Expected: 4
            {1} // Expected: 1
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = singleNumber(testCases[i]);
            if (result == testCases[i][testCases[i].length - 1]) {
                System.out.println("Test Case " + (i + 1) + ": Passed");
            } else {
                System.out.println("Test Case " + (i + 1) + ": Failed");
                System.out.println("  Expected: " + testCases[i][testCases[i].length - 1]);
                System.out.println("  Received: " + result);
            }
        }
    }
}
