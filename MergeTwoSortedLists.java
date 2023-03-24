class MergeTwoSortedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        ListNode(int val) {
            this(val, null);
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return (list1 != null) ? list1 : list2; // check for edge cases
        }
        ListNode newList = new ListNode(0);
        ListNode last = newList;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                last.next = list2;
                list2 = list2.next;
            } else {
                last.next = list1;
                list1 = list1.next;
            }
            last = last.next;
        }
        last.next = (list1 != null) ? list1 : list2; // append remaining list if any
        return newList.next;
    }

    public static void testMergeTwoLists() {
        // Create test cases
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        // Test the function
        ListNode result = mergeTwoLists(list1, list2);

        // Check that the result matches the expected output
        ListNode node1 = expected;
        ListNode node2 = result;
        while (node1 != null && node2 != null) {
            if (node1.val != node2.val) {
                System.out.println("Test failed: values do not match.");
                System.out.println("Expected: " + expected);
                System.out.println("Result: " + result);
                return;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        System.out.println("Test passed!");
    }

    public static void main(String[] args) {
        testMergeTwoLists();
    }
}