import java.util.*;


public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        
        int s1 = 1;
        int s2 = 2;
        int result = 0;
        
        for (int i = 2; i < n; i++) {
            result = s1 + s2;
            s1 = s2;
            s2 = result;
        }
        
        return result;
    }
    
    public static void testClimbStairs() {
        List<Map<String, Integer>> testCases = new ArrayList<>();
        testCases.add(createTestCase(1, 1));
        testCases.add(createTestCase(2, 2));
        testCases.add(createTestCase(3, 3));
        testCases.add(createTestCase(4, 5));
        testCases.add(createTestCase(5, 8));
        testCases.add(createTestCase(6, 13));
        testCases.add(createTestCase(7, 21));
        
        for (int i = 0; i < testCases.size(); i++) {
            Map<String, Integer> testCase = testCases.get(i);
            int input = testCase.get("input");
            int expected = testCase.get("expected");
            int result = climbStairs(input);
            
            if (result == expected) {
                System.out.println("Test case " + (i + 1) + " passed!");
            } else {
                System.out.println("Test case " + (i + 1) + " failed. Expected " + expected + ", but got " + result + ".");
            }
        }
    }
    
    public static Map<String, Integer> createTestCase(int input, int expected) {
        Map<String, Integer> testCase = new HashMap<>();
        testCase.put("input", input);
        testCase.put("expected", expected);
        return testCase;
    }
    
    public static void main(String[] args) {
        testClimbStairs();
    }
}
