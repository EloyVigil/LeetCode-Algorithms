var isPalindrome = function(x) {
    if (x < 0) {
        return false;
    }
    
    let num = x;
    let reversed = 0;
    
    while (num > 0) {
        reversed = reversed * 10 + num % 10;
        num = Math.floor(num / 10);
    }
    
    return reversed === x;
};


function testIsPalindrome() {
    const testCases = [
        {input: 121, expected: true},
        {input: -121, expected: false},
        {input: 10, expected: false},
        {input: 12321, expected: true},
        {input: 12345, expected: false},
        {input: 0, expected: true},
    ];

    for (let i = 0; i < testCases.length; i++) {
        const {input, expected} = testCases[i];
        const result = isPalindrome(input);
        if (result === expected) {
            console.log(`Test case ${i} passed`);
        } else {
            console.log(`Test case ${i} failed. Expected ${expected}, but got ${result}`);
        }
    }
}

testIsPalindrome();