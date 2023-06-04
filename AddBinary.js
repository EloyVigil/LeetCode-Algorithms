const addBinary = (a, b) => {
    let result = "";
    let carry = 0;

    for (
        let i = a.length - 1,
        j = b.length - 1;
        i >= 0 || j >= 0;
        i--, j--
    ) {
        const sum = (+a[i] || 0) + (+b[j] || 0) + carry;
        result = sum % 2 + result;
        carry = Math.floor(sum / 2);

    }

    if (carry) result = "1" + result;

    return result;
};

const testAddBinary = () => {
    const testCases = [
        { input: ["11", "1"], expected: "100" },
        { input: ["1010", "1011"], expected: "10101" },
        { input: ["0", "0"], expected: "0" },
        { input: ["111", "111"], expected: "1110" },
        { input: ["10", "101"], expected: "111" }
    ];

    for (let i = 0; i < testCases.length; i++) {
        const { input, expected } = testCases[i];
        const result = addBinary(...input);

        if (result === expected) {
            console.log(`Test case ${i + 1} passed!`);
        } else {
            console.log(`Test case ${i + 1} failed. Expected "${expected}", but got "${result}".`);
        }
    }
};

testAddBinary();