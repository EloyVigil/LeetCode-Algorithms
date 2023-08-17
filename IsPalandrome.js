const isPalindrome = (s) => {
    s = s.replace(/[^A-Za-z0-9]/g, '').toLowerCase();
    let start = 0;
    let end = s.length - 1;
    while (start < end) {
        if (s[start] !== s[end]) {
            return false;
        }
        start++;
        end--;
    }
    return true;
};

const testIsPalindrome = () => {
    
    const testCases = [
        { input: "A man, a plan, a canal, Panama", expected: true },
        { input: "race a car", expected: false },
        { input: "Madam, in Eden, I'm Adam", expected: true },
    ];

    testCases.forEach((testCase, index) => {
        const result = isPalindrome(testCase.input);
        const isEqual = result === testCase.expected;
        console.log(`Test Case ${index + 1}: ${isEqual ? 'Passed' : 'Failed'}`);
        if (!isEqual) {
            console.log(`  Expected: ${testCase.expected}`);
            console.log(`  Received: ${result}`);
        }
    });
};

testIsPalindrome();