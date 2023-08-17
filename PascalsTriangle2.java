import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            res.add(1);
            for (int j = i - 1; j > 0; j--) {
                res.set(j, res.get(j - 1) + res.get(j));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        testGetRow();
    }

    public static void testGetRow() {
        List<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase(0, Arrays.asList(1)));
        testCases.add(new TestCase(1, Arrays.asList(1, 1)));
        testCases.add(new TestCase(2, Arrays.asList(1, 2, 1)));
        testCases.add(new TestCase(3, Arrays.asList(1, 3, 3, 1)));

        for (int i = 0; i < testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            List<Integer> result = getRow(testCase.input);
            if (arraysEqual(result, testCase.expected)) {
                System.out.println("Test case passed for input = " + testCase.input);
            } else {
                System.err.println("Test case failed for input = " + testCase.input);
            }
        }
    }

    public static boolean arraysEqual(List<Integer> arr1, List<Integer> arr2) {
        return arr1.equals(arr2);
    }

    static class TestCase {
        int input;
        List<Integer> expected;

        TestCase(int input, List<Integer> expected) {
            this.input = input;
            this.expected = expected;
        }
    }
}