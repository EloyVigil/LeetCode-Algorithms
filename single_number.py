import unittest

def singleNumber(nums):
    if len(nums) == 1:
        return nums[0]
    nums.sort()
    for i in range(0, len(nums), 2):
        if i == len(nums) - 1 or nums[i] != nums[i + 1]:
            return nums[i]

def test_singleNumber():
    test_cases = [
        {"input": [2, 2, 1], "expected": 1},
        {"input": [4, 1, 2, 1, 2], "expected": 4},
        {"input": [1], "expected": 1},
    ]

    for index, test_case in enumerate(test_cases):
        result = singleNumber(test_case["input"])
        if result == test_case["expected"]:
            print(f"Test Case {index + 1}: Passed")
        else:
            print(f"Test Case {index + 1}: Failed")
            print(f"  Expected: {test_case['expected']}")
            print(f"  Received: {result}")

test_singleNumber()