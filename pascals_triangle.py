def generate(numRows):
    pascal = []
    for i in range(numRows):
        pascal.append([0] * (i + 1))
        pascal[i][0] = 1
        for j in range(1, i):
            pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j]
        pascal[i][i] = 1
    return pascal

def test_generate():
    test_cases = [
        {
            "numRows": 1,
            "expected": [[1]],
        },
        {
            "numRows": 2,
            "expected": [
                [1],
                [1, 1],
            ],
        },
        {
            "numRows": 5,
            "expected": [
                [1],
                [1, 1],
                [1, 2, 1],
                [1, 3, 3, 1],
                [1, 4, 6, 4, 1],
            ],
        },
    ]

    for test_case in test_cases:
        result = generate(test_case["numRows"])
        if arrays_equal(result, test_case["expected"]):
            print(f"Test case passed for numRows = {test_case['numRows']}")
        else:
            print(f"Test case failed for numRows = {test_case['numRows']}")

def arrays_equal(arr1, arr2):
    if len(arr1) != len(arr2):
        return False
    
    for i in range(len(arr1)):
        if any(arr1[i][j] != arr2[i][j] for j in range(len(arr1[i]))):
            return False
    
    return True

test_generate()