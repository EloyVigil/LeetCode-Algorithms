class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def mergeTwoLists(list1, list2):
    if not list1 or not list2:
        return list1 or list2  # check for edge cases
    new_list = ListNode()
    last = new_list
    while list1 and list2:
        if list1.val > list2.val:
            last.next = list2
            list2 = list2.next
        else:
            last.next = list1
            list1 = list1.next
        last = last.next
    last.next = list1 or list2  # append remaining list if any
    return new_list.next


def testMergeTwoLists():
    # Create test cases
    list1 = ListNode(1, ListNode(2, ListNode(4)))
    list2 = ListNode(1, ListNode(3, ListNode(4)))
    expected = ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(4))))))

    # Test the function
    result = mergeTwoLists(list1, list2)

    # Check that the result matches the expected output
    node1 = expected
    node2 = result
    while node1 and node2:
        if node1.val != node2.val:
            print("Test failed: values do not match.")
            print("Expected:", expected)
            print("Result:", result)
            return
        node1 = node1.next
        node2 = node2.next
    print("Test passed!")


testMergeTwoLists()