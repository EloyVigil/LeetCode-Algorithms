const removeDuplicates = function (nums) {
    for (let i = 0; i < nums.length;) {
        if (nums[i] === nums[i + 1]) {
            nums.splice(i, 1)
        } else {
            i++
        }
    }
};


function testRemoveDuplicates() {
    const testCases = [{
        input: [1, 1, 2],
        expectedOutput: [1, 2]
    },
    {
        input: [0, 0, 1, 1, 1, 2, 2, 3, 3, 4],
        expectedOutput: [0, 1, 2, 3, 4]
    },
    {
        input: [1, 1, 1],
        expectedOutput: [1]
    },
    {
        input: [1],
        expectedOutput: [1]
    },
    {
        input: [],
        expectedOutput: []
    }
    ];

    for (const testCase of testCases) {
        const { input, expectedOutput } = testCase;
        const nums = [...input];
        removeDuplicates(nums);
        const actualOutput = nums;
        if (!arraysEqual(actualOutput, expectedOutput)) {
            console.error(`Test case failed: input=${input}, expected=${expectedOutput}, actual=${actualOutput}`);
        }
    }

    console.log("All test cases pass");
}

function arraysEqual(a, b) {
    if (a === b) return true;
    if (a == null || b == null) return false;
    if (a.length !== b.length) return false;
    for (let i = 0; i < a.length; ++i) {
        if (a[i] !== b[i]) return false;
    }
    return true;
}

testRemoveDuplicates();