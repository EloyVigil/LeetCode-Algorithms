def longest_common_prefix(strs):

    # Return early on empty input
    if not strs:
        return ""

    # Loop through the letters of the first string
    for i in range(len(strs[0])):
        # Loop through the other strings
        for j in range(1, len(strs)):
            # Check if this character is also present in the same position of each string
            if strs[0][i] != strs[j][i]:
                # If not, return the string up to and including the previous character
                return strs[0][:i]

    return strs[0]


def test_longest_common_prefix():
    test_cases = [
        {
            "input": ["flower", "flow", "flight"],
            "expected_output": "fl"
        },
        {
            "input": ["dog", "racecar", "car"],
            "expected_output": ""
        },
        {
            "input": ["abc", "abcde", "abcdefg"],
            "expected_output": "abc"
        },
        {
            "input": [],
            "expected_output": ""
        },
    ]

    for i, test_case in enumerate(test_cases):
        input_strs = test_case["input"]
        expected_output = test_case["expected_output"]
        result = longest_common_prefix(input_strs)
        if result == expected_output:
            print(f"Test case {i} PASSED")
        else:
            print(f"Test case {i} FAILED: Expected '{expected_output}', but got '{result}'")

test_longest_common_prefix()