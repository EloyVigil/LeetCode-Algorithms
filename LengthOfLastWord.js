const lengthOfLastWord = (s) => {
    let result = s.trim().split(' ');
    return result[result.length - 1].length
};


const testLengthOfLastWord = () => {
    // Test cases
    const testCases = [
        { input: "Hello World", expected: 5 },
        { input: "   OpenAI    ", expected: 6 },
        { input: "This is a sentence", expected: 8 },
        { input: "NoSpacesHere", expected: 13 },
        { input: "", expected: 0 }
    ];

    // Run the test cases
    for (let i = 0; i < testCases.length; i++) {
        const { input, expected } = testCases[i];
        const result = lengthOfLastWord(input);

        if (result === expected) {
            console.log(`Test case ${i + 1} passed!`);
        } else {
            console.log(`Test case ${i + 1} failed. Expected ${expected}, but got ${result}.`);
        }
    }
}

// Invoke the test function
testLengthOfLastWord();
