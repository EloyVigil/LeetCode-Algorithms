def mySqrt(x):
    if x == 0:
        return 0

    left = 1
    right = x

    while left <= right:
        mid = (left + right) // 2
        sqr = mid * mid

        if sqr == x:
            return mid
        elif sqr < x:
            left = mid + 1
        else:
            right = mid - 1

    return right

def testMySqrt():
    
    testCases = [
        {"input": 0, "expected": 0},
        {"input": 4, "expected": 2},
        {"input": 8, "expected": 2},
        {"input": 9, "expected": 3},
        {"input": 16, "expected": 4},
        {"input": 25, "expected": 5},
        {"input": 30, "expected": 5},
        {"input": 36, "expected": 6},
    ]

    for i in range(len(testCases)):
        testCase = testCases[i]
        inputVal = testCase["input"]
        expected = testCase["expected"]
        result = mySqrt(inputVal)

        if result == expected:
            print(f"Test case {i + 1} passed!")
        else:
            print(f"Test case {i + 1} failed. Expected {expected}, but got {result}.")

testMySqrt()