def remove_duplicates(nums):
    i = 0
    while i < len(nums):
        if i + 1 < len(nums) and nums[i] == nums[i + 1]:
            nums.pop(i)
        else:
            i += 1


def test_remove_duplicates():
    test_cases = [
        {'input': [1, 1, 2], 'expected_output': [1, 2]},
        {'input': [0, 0, 1, 1, 1, 2, 2, 3, 3, 4], 'expected_output': [0, 1, 2, 3, 4]},
        {'input': [1, 1, 1], 'expected_output': [1]},
        {'input': [1], 'expected_output': [1]},
        {'input': [], 'expected_output': []}
    ]

    for test_case in test_cases:
        nums = list(test_case['input'])
        expected_output = test_case['expected_output']
        remove_duplicates(nums)
        actual_output = nums
        if actual_output != expected_output:
            print(f"Test case failed: input={nums}, expected={expected_output}, actual={actual_output}")
    
    print("All test cases pass")


def arrays_equal(a, b):
    if a is b:
        return True
    if a is None or b is None:
        return False
    if len(a) != len(b):
        return False
    for i in range(len(a)):
        if a[i] != b[i]:
            return False
    return True


test_remove_duplicates()