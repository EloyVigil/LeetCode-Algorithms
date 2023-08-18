import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        testIsPalindrome();
    }

    public static void testIsPalindrome() {
        List<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase("A man, a plan, a canal, Panama", true));
        testCases.add(new TestCase("race a car", false));
        testCases.add(new TestCase("Madam, in Eden, I'm Adam", true));

        for (int i = 0; i < testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            boolean result = isPalindrome(testCase.input);
            if (result == testCase.expected) {
                System.out.println("Test Case " + (i + 1) + ": Passed");
            } else {
                System.out.println("Test Case " + (i + 1) + ": Failed");
                System.out.println("  Expected: " + testCase.expected);
                System.out.println("  Received: " + result);
            }
        }
    }

    static class TestCase {
        String input;
        boolean expected;

        TestCase(String input, boolean expected) {
            this.input = input;
            this.expected = expected;
        }
    }
}
