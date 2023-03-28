import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

    public static int removeElement(List<Integer> nums, int val) {
        nums.removeAll(Arrays.asList(val));
        return nums.size();
    }

    public static void testRemoveElement() {
        // Test Case 1
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(3, 2, 2, 3));
        int val1 = 3;
        int expectedOutput1 = 2;
        int actualOutput1 = removeElement(arr1, val1);
        assert actualOutput1 == expectedOutput1;
        System.out.println("Test Case 1 Passed");

        // Test Case 2
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(0, 1, 2, 2, 3, 0, 4, 2));
        int val2 = 2;
        int expectedOutput2 = 5;
        int actualOutput2 = removeElement(arr2, val2);
        assert actualOutput2 == expectedOutput2;
        System.out.println("Test Case 2 Passed");

        // Test Case 3
        List<Integer> arr3 = new ArrayList<>();
        int val3 = 0;
        int expectedOutput3 = 0;
        int actualOutput3 = removeElement(arr3, val3);
        assert actualOutput3 == expectedOutput3;
        System.out.println("Test Case 3 Passed");

        // Test Case 4
        List<Integer> arr4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int val4 = 5;
        int expectedOutput4 = 4;
        int actualOutput4 = removeElement(arr4, val4);
        assert actualOutput4 == expectedOutput4;
        System.out.println("Test Case 4 Passed");
    }

    public static void main(String[] args) {
        testRemoveElement();
    }
}