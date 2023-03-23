
pairs = {
    "(": ")",
    "[": "]",
    "{": "}"
}

def is_valid(s):
    # check if length is an odd number. if it is, return false
    # if there is an odd number, it means that at least one bracket is missing a pair
    if len(s) % 2 == 1:
        return False
    
    # if the first element is a closing bracket, it doesn't matter what follows
    # it will never have a pair
    if s[0] == "]" or s[0] == ")" or s[0] == "}":
        return False
    
    # same goes for last element, we are just dealing with opening bracket
    if s[-1] == "[" or s[-1] == "(" or s[-1] == "{":
        return False
    
    stack = []
    
    for char in s:
        # if it's an opening bracket, push into stack
        # else, assume it's closing bracket and check if it matches anything
        if char in pairs:
            stack.append(char)
        elif not stack or pairs[stack.pop()] != char:
            return False
        
    return len(stack) == 0

def test_is_valid():
    test_cases = [
        {"input": "()", "expected_output": True},
        {"input": "()[]{}", "expected_output": True},
        {"input": "(}", "expected_output": False},
        {"input": "[]]", "expected_output": False},
    ]

    for test_case in test_cases:
        input_str = test_case["input"]
        expected_output = test_case["expected_output"]
        result = is_valid(input_str)
        print(f"Input: {input_str}. Expected output: {expected_output}. Result: {result}")
        if result != expected_output:
            print(f"Test failed for input {input_str}. Expected output: {expected_output}. Result: {result}")

test_is_valid()