def length_of_last_word(s):
    result = s.strip().split()
    return len(result[-1]) if result else 0


def test_length_of_last_word():
    # Test cases
    test_cases = [
        {"input": "Hello World", "expected": 5},
        {"input": "   OpenAI    ", "expected": 6},
        {"input": "This is a sentence", "expected": 8},
        {"input": "NoSpacesHere", "expected": 13},
        {"input": "", "expected": 0}
    ]

    # Run the test cases
    for i, test_case in enumerate(test_cases):
        input_str = test_case["input"]
        expected = test_case["expected"]
        result = length_of_last_word(input_str)

        if result == expected:
            print(f"Test case {i + 1} passed!")
        else:
            print(f"Test case {i + 1} failed. Expected {expected}, but got {result}.")


# Invoke the test function
test_length_of_last_word()
