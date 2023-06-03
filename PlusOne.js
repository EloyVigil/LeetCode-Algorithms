const plusOne = (digits) => {
    for (var i = digits.length - 1; i >= 0; i--) {
        digits[i]++;
        if (digits[i] > 9) {
            digits[i] = 0;
        } else {
            return digits;
        }
    }
    digits.unshift(1);
    return digits;
};

const testPlusOne = () => {
    // Test cases
    const testCases = [
        { input: [1, 2, 3], expected: [1, 2, 4] },
        { input: [4, 3, 2, 1], expected: [4, 3, 2, 2] },
        { input: [9, 9, 9], expected: [1, 0, 0, 0] },
        { input: [0], expected: [1] },
        { input: [1, 9], expected: [2, 1] }
    ];

    // Run the test cases
    for (let i = 0; i < testCases.length; i++) {
        const { input, expected } = testCases[i];
        const result = plusOne(input);

        if (JSON.stringify(result) === JSON.stringify(expected)) {
            console.log(`Test case ${i + 1} passed!`);
        } else {
            console.log(`Test case ${i + 1} failed. Expected [${expected}], but got [${result}].`);
        }
    }
};


testPlusOne();