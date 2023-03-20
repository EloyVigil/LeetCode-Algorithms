var romanToInt = function (s) {
    const romanNum = {
        'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000
    }
    let num = 0;
    for (let i = 0; i < s.length; i++) {
        let current = romanNum[s[i]]
        let next = romanNum[s[i + 1]]
        if (current < next) {
            num -= current
        } else {
            num += current;
        }
    }
    return num;
};


function testRomanToInt() {
    console.assert(romanToInt('III') === 3, 'Test Case 1 Failed');
    console.assert(romanToInt('LVIII') === 58, 'Test Case 2 Failed');
    console.assert(romanToInt('MCMXCIV') === 1994, 'Test Case 3 Failed');
}

testRomanToInt();