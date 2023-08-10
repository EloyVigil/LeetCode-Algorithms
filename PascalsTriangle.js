const generate = (numRows) => {
    var pascal = [];
    for (var i = 0; i < numRows; i++) {
        pascal[i] = [];
        pascal[i][0] = 1;
        for (var j = 1; j < i; j++) {
            pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j]
        }
        pascal[i][i] = 1;
    }
    return pascal;
};

function testGenerate() {
    const testCases = [
        {
            numRows: 1,
            expected: [[1]],
        },
        {
            numRows: 2,
            expected: [
                [1],
                [1, 1],
            ],
        },
        {
            numRows: 5,
            expected: [
                [1],
                [1, 1],
                [1, 2, 1],
                [1, 3, 3, 1],
                [1, 4, 6, 4, 1],
            ],
        },
    ];

    for (const testCase of testCases) {
        const result = generate(testCase.numRows);
        if (arraysEqual(result, testCase.expected)) {
            console.log(`Test case passed for numRows = ${testCase.numRows}`);
        } else {
            console.error(`Test case failed for numRows = ${testCase.numRows}`);
        }
    }
}

function arraysEqual(arr1, arr2) {
    if (arr1.length !== arr2.length) {
        return false;
    }
    
    for (let i = 0; i < arr1.length; i++) {
        if (!arr1[i].every((value, index) => value === arr2[i][index])) {
            return false;
        }
    }
    
    return true;
}

testGenerate();