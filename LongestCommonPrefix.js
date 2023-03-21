var longestCommonPrefix = function (strs) {

    // Return early on empty input
    if (!strs.length) return '';

    // Loop through the letters of the first string
    for (let i = 0; i <= strs[0].length; i++) {
        // Loop through the other strings
        for (let j = 1; j < strs.length; j++) {
            // Check if this character is also present in the same position of each string
            if (strs[0][i] !== strs[j][i]) {
                // If not, return the string up to and including the previous character
                return strs[0].slice(0, i);
            }
        }
    }

    return strs[0];

};

function testLongestCommonPrefix() {

    const testCases = [
        { input: ["flower", "flow", "flight"], expectedOutput: "fl" },
        { input: ["dog", "racecar", "car"], expectedOutput: "" },
        { input: ["abc", "abcde", "abcdefg"], expectedOutput: "abc" },
        { input: [], expectedOutput: "" },
        // add more test cases here
    ];

    for (const { input, expectedOutput } of testCases) {
        const result = longestCommonPrefix(input);
        console.log(`Input: ${JSON.stringify(input)}. Expected output: ${expectedOutput}. Result: ${result}`);
        if (result !== expectedOutput) {
            console.error(`Test failed for input ${JSON.stringify(input)}. Expected output: ${expectedOutput}. Result: ${result}`);
        }
    }
}