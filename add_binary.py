def addBinary(a, b):
    result = ""
    carry = 0

    i = len(a) - 1
    j = len(b) - 1

    while i >= 0 or j >= 0:
        sum = (int(a[i]) if i >= 0 else 0) + (int(b[j]) if j >= 0 else 0) + carry
        result = str(sum % 2) + result
        carry = sum // 2
        i -= 1
        j -= 1

    if carry:
        result = "1" + result

    return result


def testAddBinary():
    testCases = [
        {"input": ["11", "1"], "expected": "100"},
        {"input": ["1010", "1011"], "expected": "10101"},
        {"input": ["0", "0"], "expected": "0"},
        {"input": ["111", "111"], "expected": "1110"},
        {"input": ["10", "101"], "expected": "111"}
    ]

    for i in range(len(testCases)):
        testCase = testCases[i]
        inputList = testCase["input"]
        expected = testCase["expected"]
        result = addBinary(*inputList)

        if result == expected:
            print(f"Test case {i + 1} passed!")
        else:
            print(f"Test case {i + 1} failed. Expected '{expected}', but got '{result}'.")

testAddBinary()