class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def deleteDuplicates(head):
    if head is None:
        return None

    curr = head
    while curr.next is not None:
        if curr.val == curr.next.val:
            curr.next = curr.next.next
        else:
            curr = curr.next

    return head

def createLinkedList(arr):
    if len(arr) == 0:
        return None

    head = ListNode(arr[0])
    curr = head
    for i in range(1, len(arr)):
        curr.next = ListNode(arr[i])
        curr = curr.next

    return head

def isEqualLinkedList(list1, list2):
    curr1 = list1
    curr2 = list2
    while curr1 is not None and curr2 is not None:
        if curr1.val != curr2.val:
            return False
        curr1 = curr1.next
        curr2 = curr2.next

    return curr1 is None and curr2 is None

def getExpectedOutput(test_case):
    if test_case == 0:
        return createLinkedList([1, 2, 3])
    elif test_case == 1:
        return createLinkedList([1])
    elif test_case == 2:
        return createLinkedList([1, 2, 3])
    elif test_case == 3:
        return None
    else:
        return None

def testDeleteDuplicates():
    test_cases = [
        createLinkedList([1, 1, 2, 3, 3]),
        createLinkedList([1, 1, 1]),
        createLinkedList([1, 2, 3]),
        createLinkedList([])
    ]

    for i in range(len(test_cases)):
        input_list = test_cases[i]
        expected_output = getExpectedOutput(i)

        result = deleteDuplicates(input_list)
        if isEqualLinkedList(result, expected_output):
            print(f"Test case {i+1} passed!")
        else:
            print(f"Test case {i+1} failed.")

testDeleteDuplicates()
