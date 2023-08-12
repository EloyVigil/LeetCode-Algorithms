const singleNumber = (nums) => {
    if(nums.length === 1){
        return nums[0];
    }
    nums.sort((a, b) => a - b);
    for(let i = 0; i < nums.length; i++){
        if(nums[i] !== nums[i+1]){
            return nums[i]
        } else {
            i++;
        }
    }
};

const testSingleNumber = () => {
    const testCases = [
        { input: [2, 2, 1], expected: 1 },
        { input: [4, 1, 2, 1, 2], expected: 4 },
        { input: [1], expected: 1 },
    ];

    testCases.forEach((testCase, index) => {
        const result = singleNumber(testCase.input);
        const isEqual = result === testCase.expected;
        console.log(`Test Case ${index + 1}: ${isEqual ? 'Passed' : 'Failed'}`);
        if (!isEqual) {
            console.log(`  Expected: ${testCase.expected}`);
            console.log(`  Received: ${result}`);
        }
    });
};

testSingleNumber();