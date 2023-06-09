const deleteDuplicates = (head) => {
    if (head == null) {
        return null;
    }

    let curr = head;
    while (curr.next != null) {
        if (curr.val == curr.next.val) {
            let next_next = curr.next.next;
            let nodeToDelete = curr.next;
            delete (nodeToDelete);
            curr.next = next_next;
        } else {
            curr = curr.next;
        }
    }

    return head;
};

const testDeleteDuplicates = () => {
    // Test cases
    const testCases = [
        {
            input: createLinkedList([1, 1, 2, 3, 3]),
            expected: createLinkedList([1, 2, 3])
        },
        {
            input: createLinkedList([1, 1, 1]),
            expected: createLinkedList([1])
        },
        {
            input: createLinkedList([1, 2, 3]),
            expected: createLinkedList([1, 2, 3])
        },
        {
            input: createLinkedList([]),
            expected: createLinkedList([])
        }
    ];

    // Run the test cases
    for (let i = 0; i < testCases.length; i++) {
        const { input, expected } = testCases[i];
        const result = deleteDuplicates(input);

        if (isEqualLinkedList(result, expected)) {
            console.log(`Test case ${i + 1} passed!`);
        } else {
            console.log(`Test case ${i + 1} failed.`);
        }
    }
};

// Helper functions to create and compare linked lists
function ListNode(val) {
    this.val = val;
    this.next = null;
}

function createLinkedList(arr) {
    if (arr.length === 0) {
        return null;
    }

    const head = new ListNode(arr[0]);
    let curr = head;

    for (let i = 1; i < arr.length; i++) {
        curr.next = new ListNode(arr[i]);
        curr = curr.next;
    }

    return head;
}

function isEqualLinkedList(list1, list2) {
    let curr1 = list1;
    let curr2 = list2;

    while (curr1 && curr2) {
        if (curr1.val !== curr2.val) {
            return false;
        }
        curr1 = curr1.next;
        curr2 = curr2.next;
    }

    return curr1 === null && curr2 === null;
}

// Invoke the test function
testDeleteDuplicates();
