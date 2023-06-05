const mySqrt = (x) => {
    if (x === 0) {
        return 0;
    }

    let left = 1;
    let right = x;

    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        let sqr = mid * mid;

        if (sqr === x) {
            return mid;
        } else if (sqr < x) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return right;
};

const testMySqrt = () => {
    
    const testCases = [
        { input: 0, expected: 0 },
        { input: 4, expected: 2 },
        { input: 8, expected: 2 },
        { input: 9, expected: 3 },
        { input: 16, expected: 4 },
        { input: 25, expected: 5 },
        { input: 30, expected: 5 },
        { input: 36, expected: 6 },
    ];

    
    for (let i = 0; i < testCases.length; i++) {
        const { input, expected } = testCases[i];
        const result = mySqrt(input);

        if (result === expected) {
            console.log(`Test case ${i + 1} passed!`);
        } else {
            console.log(`Test case ${i + 1} failed. Expected ${expected}, but got ${result}.`);
        }
    }
};

testMySqrt();