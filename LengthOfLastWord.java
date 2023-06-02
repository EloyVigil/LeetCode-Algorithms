import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
    public static void main(String[] args) {
        testLengthOfLastWord();
    }

    public static int lengthOfLastWord(String s) {
        List<String> words = Arrays.asList(s.trim().split(" "));
        String lastWord = words.get(words.size() - 1);
        return lastWord.length();
    }

    public static void testLengthOfLastWord() {
        // Test cases
        List<TestCase> testCases = Arrays.asList(
                new TestCase("Hello World", 5),
                new TestCase("   OpenAI    ", 6),
                new TestCase("This is a sentence", 8),
                new TestCase("NoSpacesHere", 13),
                new TestCase("", 0)
        );

        // Run the test cases
        for (int i = 0; i < testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            String input = testCase.getInput();
            int expected = testCase.getExpected();
            int result = lengthOfLastWord(input);

            if (result == expected) {
                System.out.println("Test case " + (i + 1) + " passed!");
            } else {
                System.out.println("Test case " + (i + 1) + " failed. Expected " + expected + ", but got " + result + ".");
            }
        }
    }

    static class TestCase {
        private String input;
        private int expected;

        public TestCase(String input, int expected) {
            this.input = input;
            this.expected = expected;
        }

        public String getInput() {
            return input;
        }

        public int getExpected() {
            return expected;
        }
    }
}
