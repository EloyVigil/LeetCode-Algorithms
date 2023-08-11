const getRow = (rowIndex) => {
    let res = [];
    for(let i = 0;i <= rowIndex; i++){
        res[i] = [];
        res[i][0] = 1;
        for(let j =1 ; j < i; j++){
            res[i][j] = res[i-1][j-1] + res[i-1][j];
        }
        res[i][i] = 1;
    }

    return res[rowIndex];
};

const testGetRow = () => {
    const testCases = [
        { input: 0, expected: [1] },
        { input: 1, expected: [1, 1] },
        { input: 2, expected: [1, 2, 1] },
        { input: 3, expected: [1, 3, 3, 1] },
    ];

    testCases.forEach((testCase, index) => {
        const result = getRow(testCase.input);
        const isEqual = JSON.stringify(result) === JSON.stringify(testCase.expected);
        console.log(`Test Case ${index + 1}: ${isEqual ? 'Passed' : 'Failed'}`);
        if (!isEqual) {
            console.log(`  Expected: ${JSON.stringify(testCase.expected)}`);
            console.log(`  Received: ${JSON.stringify(result)}`);
        }
    });
};

testGetRow();