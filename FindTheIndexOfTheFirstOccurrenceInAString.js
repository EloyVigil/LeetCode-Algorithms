var strStr = function (haystack, needle) {
    if (needle === "") { // If 'needle' is an empty string, return -1
        return -1;
    }
    // Iterate over each character in 'haystack' until the last character of 'needle' can fit in the remaining length of 'haystack'
    for (let i = 0; i <= haystack.length - needle.length; i++) {
        let str = ""; // Initialize an empty string 'str' for each iteration
        // Iterate over each character in the substring of 'haystack' starting from the ith index and with a length equal to the length of 'needle'
        for (let j = i; j < i + needle.length; j++) {
            str += haystack[j]; // Append each character to the 'str' string
        }
        if (str == needle) { // If the 'str' string matches 'needle'
            return i; // Return the index at which the substring containing 'needle' starts in 'haystack'
        }
    }
    return -1; // If 'needle' is not found in 'haystack', return -1
};


function testStrStr() {
    // Test Case 1
    let haystack1 = "hello";
    let needle1 = "ll";
    let expected1 = 2;
    let result1 = strStr(haystack1, needle1);
    console.log(result1 === expected1 ? "PASS" : "FAIL");

    // Test Case 2
    let haystack2 = "aaaaa";
    let needle2 = "bba";
    let expected2 = -1;
    let result2 = strStr(haystack2, needle2);
    console.log(result2 === expected2 ? "PASS" : "FAIL");

    // Test Case 3
    let haystack3 = "";
    let needle3 = "";
    let expected3 = 0;
    let result3 = strStr(haystack3, needle3);
    console.log(result3 === expected3 ? "PASS" : "FAIL");
}

testStrStr();