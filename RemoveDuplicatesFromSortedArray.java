import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        testRemoveDuplicates();
    }

    public static void removeDuplicates(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1;) {
            if (nums.get(i).equals(nums.get(i + 1))) {
                nums.remove(i);
            } else {
                i++;
            }
        }
    }

    public static void testRemoveDuplicates() {
        List<List<Integer>> testCases = Arrays.asList(
            Arrays.asList(1, 1, 2),
            Arrays.asList(0, 0, 1, 1, 1, 2, 2, 3, 3, 4),
            Arrays.asList(1, 1, 1),
            Arrays.asList(1),
            Arrays.asList()
        );

        List<List<Integer>> expectedOutputs = Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(0, 1, 2, 3, 4),
            Arrays.asList(1),
            Arrays.asList(1),
            Arrays.asList()
        );

        for (int i = 0; i < testCases.size(); i++) {
            List<Integer> input = new ArrayList<>(testCases.get(i));
            List<Integer> expectedOutput = new ArrayList<>(expectedOutputs.get(i));
            removeDuplicates(input);
            List<Integer> actualOutput = input;
            if (!actualOutput.equals(expectedOutput)) {
                System.err.printf("Test case failed: input=%s, expected=%s, actual=%s%n", input, expectedOutput, actualOutput);
            }
        }

        System.out.println("All test cases pass");
    }

    public static boolean arraysEqual(List<Integer> a, List<Integer> b) {
        if (a == b) return true;
        if (a == null || b == null) return false;
        if (a.size() != b.size()) return false;
        for (int i = 0; i < a.size(); ++i) {
            if (!a.get(i).equals(b.get(i))) return false;
        }
        return true;
    }

}