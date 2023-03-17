def two_sum(nums, target):
    numMap = {}
    for i in range(len(nums)):
        complement = target - nums[i]
        complementIndex = -1
        for j in range(i):
            if nums[j] == complement:
                complementIndex = j
                break
        if complementIndex != -1:
            return [complementIndex, i]
        numMap[nums[i]] = i
    raise ValueError("No two sum solution")

def test_two_sum():
    test_cases = [
        {'nums': [2, 7, 11, 15], 'target': 9, 'expected': [0, 1]},
        {'nums': [3, 2, 4], 'target': 6, 'expected': [1, 2]},
        {'nums': [3, 3], 'target': 6, 'expected': [0, 1]}
    ]

    for test_case in test_cases:
        nums = test_case['nums']
        target = test_case['target']
        expected = test_case['expected']
        result = two_sum(nums, target)
        if result != expected:
            print(f"Test failed for input ({nums}, {target}). Expected {expected}, but got {result}.")