const maxProfit = (prices) => {
    let buy = prices[0]
    let maxProfit = 0;
    for (let i = 0; i < prices.length; i++) {
        if (prices[i] - buy > maxProfit) {
            maxProfit = prices[i] - buy
        }
        if (prices[i] < buy) {
            buy = prices[i]
        }
    }
    return maxProfit
};

const testMaxProfit = () => {
    const testCases = [
        { input: [7, 1, 5, 3, 6, 4], expected: 5 },
        { input: [7, 6, 4, 3, 1], expected: 0 },
        { input: [3, 2, 6, 5, 0, 3], expected: 4 },
    ];

    testCases.forEach((testCase, index) => {
        const result = maxProfit(testCase.input);
        const isEqual = result === testCase.expected;
        console.log(`Test Case ${index + 1}: ${isEqual ? 'Passed' : 'Failed'}`);
        if (!isEqual) {
            console.log(`  Expected: ${testCase.expected}`);
            console.log(`  Received: ${result}`);
        }
    });
};

testMaxProfit();