import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    private static final Map<Character, Character> pairs = new HashMap<Character, Character>() {{
        put('(', ')');
        put('[', ']');
        put('{', '}');
    }};

    public static boolean isValid(String s) {
        // check if length is an odd number. if it is, return false
        // if there is an odd number, it means that at least one bracket is missing a pair
        if (s.length() % 2 == 1) return false;

        // if the first element is a closing bracket, it doesn't matter what follows
        // it will never have a pair
        if (s.charAt(0) == ']' || s.charAt(0) == ')' || s.charAt(0) == '}') return false;

        // same goes for last element, we are just dealing with opening bracket
        if (s.charAt(s.length() - 1) == '[' || s.charAt(s.length() - 1) == '(' || s.charAt(s.length() - 1) == '{') return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // if it's an opening bracket, push into stack
            // else, assume it's closing bracket and check if it matches anything
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (pairs.get(stack.pop()) != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[][] testCases = {{"()", "true"}, {"()[]{}", "true"}, {"(}", "false"}, {"[]]", "false"}};

        for (String[] testCase : testCases) {
            String input = testCase[0];
            boolean expectedOutput = Boolean.parseBoolean(testCase[1]);
            boolean result = isValid(input);
            System.out.printf("Input: %s. Expected output: %s. Result: %s.%n", input, expectedOutput, result);
            if (result != expectedOutput) {
                System.err.printf("Test failed for input %s. Expected output: %s. Result: %s.%n", input, expectedOutput, result);
            }
        }
    }
}