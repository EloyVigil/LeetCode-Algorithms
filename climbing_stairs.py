def climbStairs(n):
    if n <= 0:
        return 0
    if n == 1:
        return 1
    if n == 2:
        return 2
    
    s1 = 1
    s2 = 2
    result = 0
    
    for i in range(2, n):
        result = s1 + s2
        s1 = s2
        s2 = result
    
    return result


def testClimbStairs():
    testCases = [
        {"input": 1, "expected": 1},
        {"input": 2, "expected": 2},
        {"input": 3, "expected": 3},
        {"input": 4, "expected": 5},
        {"input": 5, "expected": 8},
        {"input": 6, "expected": 13},
        {"input": 8, "expected": 21},
    ]
    
    for i in range(len(testCases)):
        testCase = testCases[i]
        input_val = testCase["input"]
        expected = testCase["expected"]
        result = climbStairs(input_val)
        
        if result == expected:
            print(f"Test case {i + 1} passed!")
        else:
            print(f"Test case {i + 1} failed. Expected {expected}, but got {result}.")


testClimbStairs()
