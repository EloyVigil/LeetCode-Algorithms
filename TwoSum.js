var twoSum = function (nums, target) {
    const numMap = {};

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        let complementIndex = -1;
        for (let j = 0; j < i; j++) {
            if (nums[j] === complement) {
                complementIndex = j;
                break;
            }
        }
        if (complementIndex !== -1) {
            return [complementIndex, i];
        }
        numMap[nums[i]] = i;
    }
};


function testTwoSum() {
    const testCases = [
        { nums: [2, 7, 11, 15], target: 9, expected: [0, 1] },
        { nums: [3, 2, 4], target: 6, expected: [1, 2] },
        { nums: [3, 3], target: 6, expected: [0, 1] },
    ];

    for (const { nums, target, expected } of testCases) {
        const result = twoSum(nums, target);
        if (result[0] !== expected[0] || result[1] !== expected[1]) {
            console.error(`Test failed for input (${nums}, ${target}). Expected ${expected}, but got ${result}.`);
        }
    }
}

// Run the tests
testTwoSum();

