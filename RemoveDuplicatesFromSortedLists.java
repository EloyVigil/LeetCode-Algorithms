import java.util.Arrays;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveDuplicatesFromSortedLists {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode curr = head;
        while (curr.next != null) {
            if (curr.val == curr.next.val) {
                ListNode nextNext = curr.next.next;
                curr.next = nextNext;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        // Test cases
        List<ListNode> testCases = Arrays.asList(
                createLinkedList(new int[]{1, 1, 2, 3, 3}),
                createLinkedList(new int[]{1, 1, 1}),
                createLinkedList(new int[]{1, 2, 3}),
                createLinkedList(new int[]{})
        );

        // Run the test cases
        for (int i = 0; i < testCases.size(); i++) {
            ListNode input = testCases.get(i);
            ListNode expected = deleteDuplicates(input);

            if (isEqualLinkedList(expected, getExpectedOutput(i))) {
                System.out.println("Test case " + (i + 1) + " passed!");
            } else {
                System.out.println("Test case " + (i + 1) + " failed.");
            }
        }
    }

    // Helper functions to create and compare linked lists
    private static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }

    private static boolean isEqualLinkedList(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;

        while (curr1 != null && curr2 != null) {
            if (curr1.val != curr2.val) {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return curr1 == null && curr2 == null;
    }

    // Helper function to get the expected output for each test case
    private static ListNode getExpectedOutput(int testCase) {
        switch (testCase) {
            case 0:
                return createLinkedList(new int[]{1, 2, 3});
            case 1:
                return createLinkedList(new int[]{1});
            case 2:
                return createLinkedList(new int[]{1, 2, 3});
            case 3:
                return null;
            default:
                return null;
        }
    }
}
