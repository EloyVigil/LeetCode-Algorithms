public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int num = x;
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return reversed == x;
    }

    public static void testIsPalindrome() {
        int[][] testCases = {
            {121, 1},
            {-121, 0},
            {10, 0},
            {12321, 1},
            {12345, 0},
            {0, 1}
        };
    
        for (int i = 0; i < testCases.length; i++) {
            int[] testCase = testCases[i];
            int input = testCase[0];
            int expected = testCase[1];
    
            int result = isPalindrome(input) ? 1 : 0;
            if (result == expected) {
                System.out.println("Test case " + i + " passed");
            } else {
                System.out.println("Test case " + i + " failed. Expected " + expected + ", but got " + result);
            }
        }
    }

    public static void main(String[] args) {
        testIsPalindrome();
    }
}