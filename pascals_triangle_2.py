def get_row(row_index):
    res = []
    for i in range(row_index + 1):
        res.append(1)
        for j in range(i - 1, 0, -1):
            res[j] = res[j - 1] + res[j]
    return res

def test_get_row():
    test_cases = [
        {"input": 0, "expected": [1]},
        {"input": 1, "expected": [1, 1]},
        {"input": 2, "expected": [1, 2, 1]},
        {"input": 3, "expected": [1, 3, 3, 1]}
    ]

    for index, test_case in enumerate(test_cases):
        result = get_row(test_case["input"])
        if result == test_case["expected"]:
            print(f"Test Case {index + 1}: Passed")
        else:
            print(f"Test Case {index + 1}: Failed")
            print(f"  Expected: {test_case['expected']}")
            print(f"  Received: {result}")

test_get_row()