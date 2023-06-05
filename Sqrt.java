
public class Sqrt {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = (left + right) / 2;
            int sqr = mid * mid;

            if (sqr == x) {
                return mid;
            } else if (sqr < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static void testMySqrt() {
        
        int[][] testCases = {
            {0, 0},
            {4, 2},
            {8, 2},
            {9, 3},
            {16, 4},
            {25, 5},
            {30, 5},
            {36, 6}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] testCase = testCases[i];
            int input = testCase[0];
            int expected = testCase[1];
            int result = mySqrt(input);

            if (result == expected) {
                System.out.println("Test case " + (i + 1) + " passed!");
            } else {
                System.out.println("Test case " + (i + 1) + " failed. Expected " + expected + ", but got " + result + ".");
            }
        }
    }

    public static void main(String[] args) {
        testMySqrt();
    }
}

