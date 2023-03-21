public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // Return early on empty input
        if (strs.length == 0) {
            return "";
        }

        // Loop through the letters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            // Loop through the other strings
            for (int j = 1; j < strs.length; j++) {
                // Check if this character is also present in the same position of each string
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    // If not, return the string up to and including the previous character
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    public static void testLongestCommonPrefix() {
        String[][] testCases = {
            {"flower", "flow", "flight"},
            {"dog", "racecar", "car"},
            {"abc", "abcde", "abcdefg"},
            {}
        };
        String[] expectedOutputs = {"fl", "", "abc", ""};

        for (int i = 0; i < testCases.length; i++) {
            String[] inputStrs = testCases[i];
            String expectedOutput = expectedOutputs[i];
            String result = longestCommonPrefix(inputStrs);
            if (result.equals(expectedOutput)) {
                System.out.printf("Test case %d PASSED%n", i);
            } else {
                System.out.printf("Test case %d FAILED: Expected '%s', but got '%s'%n", i, expectedOutput, result);
            }
        }
    }

    public static void main(String[] args) {
        testLongestCommonPrefix();
    }
}
