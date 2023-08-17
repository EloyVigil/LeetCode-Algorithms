import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }

    public static void main(String[] args) {
        testGenerate();
    }

    public static void testGenerate() {
        List<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase(1, new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>() {{
                add(1);
            }});
        }}));
        testCases.add(new TestCase(2, new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>() {{
                add(1);
            }});
            add(new ArrayList<Integer>() {{
                add(1);
                add(1);
            }});
        }}));
        testCases.add(new TestCase(5, new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>() {{
                add(1);
            }});
            add(new ArrayList<Integer>() {{
                add(1);
                add(1);
            }});
            add(new ArrayList<Integer>() {{
                add(1);
                add(2);
                add(1);
            }});
            add(new ArrayList<Integer>() {{
                add(1);
                add(3);
                add(3);
                add(1);
            }});
            add(new ArrayList<Integer>() {{
                add(1);
                add(4);
                add(6);
                add(4);
                add(1);
            }});
        }}));

        for (int i = 0; i < testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            List<List<Integer>> result = generate(testCase.numRows);
            if (arraysEqual(result, testCase.expected)) {
                System.out.println("Test case passed for numRows = " + testCase.numRows);
            } else {
                System.err.println("Test case failed for numRows = " + testCase.numRows);
            }
        }
    }

    public static boolean arraysEqual(List<List<Integer>> arr1, List<List<Integer>> arr2) {
        if (arr1.size() != arr2.size()) {
            return false;
        }

        for (int i = 0; i < arr1.size(); i++) {
            List<Integer> row1 = arr1.get(i);
            List<Integer> row2 = arr2.get(i);
            if (!row1.equals(row2)) {
                return false;
            }
        }

        return true;
    }

    static class TestCase {
        int numRows;
        List<List<Integer>> expected;

        TestCase(int numRows, List<List<Integer>> expected) {
            this.numRows = numRows;
            this.expected = expected;
        }
    }
}
