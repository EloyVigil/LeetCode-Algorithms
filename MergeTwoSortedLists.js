var mergeTwoLists = function (list1, list2) {
    if (!list1 || !list2) return list1 || list2; // check for edge cases
    let newList = new ListNode();
    let last = newList;
    while (list1 && list2) {
        if (list1.val > list2.val) {
            last.next = list2;
            list2 = list2.next;
        } else {
            last.next = list1;
            list1 = list1.next;
        }
        last = last.next;
    }
    last.next = list1 || list2; // append remaining list if any
    return newList.next;
};

class ListNode {
    constructor(val = 0, next = null) {
        this.val = val;
        this.next = next;
    }
}

function testMergeTwoLists() {
    // Create test cases
    const list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    const list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    const expected = new ListNode(
        1,
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4)))))
    );

    // Test the function
    const result = mergeTwoLists(list1, list2);

    // Check that the result matches the expected output
    let node1 = expected;
    let node2 = result;
    while (node1 && node2) {
        if (node1.val !== node2.val) {
            console.log("Test failed: values do not match.");
            console.log("Expected:", expected);
            console.log("Result:", result);
            return;
        }
        node1 = node1.next;
        node2 = node2.next;
    }
    console.log("Test passed!");
}
testMergeTwoLists();