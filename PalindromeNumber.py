def isPalindrome(x: int) -> bool:
    if x < 0:
        return False
    
    num = x
    reversed_num = 0
    
    while num > 0:
        reversed_num = reversed_num * 10 + num % 10
        num = num // 10
    
    return reversed_num == x


def testIsPalindrome():
    testCases = [
        {'input': 121, 'expected': True},
        {'input': -121, 'expected': False},
        {'input': 10, 'expected': False},
        {'input': 12321, 'expected': True},
        {'input': 12345, 'expected': False},
        {'input': 0, 'expected': True},
    ]

    for i, testCase in enumerate(testCases):
        input_val = testCase['input']
        expected_val = testCase['expected']
        result = isPalindrome(input_val)
        if result == expected_val:
            print(f"Test case {i} passed")
        else:
            print(f"Test case {i} failed. Expected {expected_val}, but got {result}")


testIsPalindrome()

