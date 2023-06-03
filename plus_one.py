def plusOne(digits):
    for i in range(len(digits) - 1, -1, -1):
        digits[i] += 1
        if digits[i] > 9:
            digits[i] = 0
        else:
            return digits
    digits.insert(0, 1)
    return digits

def testPlusOne():
    # Test cases
    testCases = [
        {"input": [1, 2, 3], "expected": [1, 2, 4]},
        {"input": [4, 3, 2, 1], "expected": [4, 3, 2, 2]},
        {"input": [9, 9, 9], "expected": [1, 0, 0, 0]},
        {"input": [0], "expected": [1]},
        {"input": [1, 9], "expected": [2, 0]}
    ]

    # Run the test cases
    for i in range(len(testCases)):
        testCase = testCases[i]
        inputList = testCase["input"]
        expected = testCase["expected"]
        result = plusOne(inputList)

        if result == expected:
            print(f"Test case {i + 1} passed!")
        else:
            print(f"Test case {i + 1} failed. Expected {expected}, but got {result}.")


testPlusOne()
