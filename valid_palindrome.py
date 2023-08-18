def is_palindrome(s):
    s = ''.join(c for c in s if c.isalnum()).lower()
    start = 0
    end = len(s) - 1
    while start < end:
        if s[start] != s[end]:
            return False
        start += 1
        end -= 1
    return True

def test_is_palindrome():
    test_cases = [
        {"input": "A man, a plan, a canal, Panama", "expected": True},
        {"input": "race a car", "expected": False},
        {"input": "Madam, in Eden, I'm Adam", "expected": True}
    ]

    for index, test_case in enumerate(test_cases):
        result = is_palindrome(test_case["input"])
        if result == test_case["expected"]:
            print(f"Test Case {index + 1}: Passed")
        else:
            print(f"Test Case {index + 1}: Failed")
            print(f"  Expected: {test_case['expected']}")
            print(f"  Received: {result}")

test_is_palindrome()