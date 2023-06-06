const climbStairs = (n) => {
    
    if (n <= 0){
        return 0;
    }
    if (n == 1){
        return 1;
    }
    if (n == 2){
        return 2;
    }
    
    let s1 = 1;
    let s2 = 2;
    let  result = 0;
    for(let i = 2; i < n; i++){
        result = s1 + s2;
        s1 = s2;
        s2 = result;
    }
    return result;
};


const testClimbStairs = () => {

    const testCases = [
        { input: 1, expected: 1 },
        { input: 2, expected: 2 },
        { input: 3, expected: 3 },
        { input: 4, expected: 5 },
        { input: 5, expected: 8 },
        { input: 6, expected: 13 },
        { input: 7, expected: 21 },
    ];

    for (let i = 0; i < testCases.length; i++) {
        const { input, expected } = testCases[i];
        const result = climbStairs(input);

        if (result === expected) {
            console.log(`Test case ${i + 1} passed!`);
        } else {
            console.log(`Test case ${i + 1} failed. Expected ${expected}, but got ${result}.`);
        }
    }
};

testClimbStairs();