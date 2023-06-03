import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] <= 9) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void testPlusOne() {
        // Test cases
        int[][] testCases = {
            {1, 2, 3},
            {4, 3, 2, 1},
            {9, 9, 9},
            {0},
            {1, 9}
        };
        int[][] expectedResults = {
            {1, 2, 4},
            {4, 3, 2, 2},
            {1, 0, 0, 0},
            {1},
            {2, 0}
        };

        // Run the test cases
        for (int i = 0; i < testCases.length; i++) {
            int[] input = testCases[i];
            int[] expected = expectedResults[i];
            int[] result = plusOne(input);

            if (Arrays.equals(result, expected)) {
                System.out.println("Test case " + (i + 1) + " passed!");
            } else {
                System.out.println("Test case " + (i + 1) + " failed. Expected " + Arrays.toString(expected)
                        + ", but got " + Arrays.toString(result) + ".");
            }
        }
    }

    public static void main(String[] args) {
        
        testPlusOne();
    }
}
