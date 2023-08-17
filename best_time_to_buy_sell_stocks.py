def max_profit(prices):
    buy = prices[0]
    max_profit = 0
    for price in prices:
        if price - buy > max_profit:
            max_profit = price - buy
        if price < buy:
            buy = price
    return max_profit

def test_max_profit():
    test_cases = [
        {"input": [7, 1, 5, 3, 6, 4], "expected": 5},
        {"input": [7, 6, 4, 3, 1], "expected": 0},
        {"input": [3, 2, 6, 5, 0, 3], "expected": 4},
    ]

    for index, test_case in enumerate(test_cases):
        result = max_profit(test_case["input"])
        if result == test_case["expected"]:
            print(f"Test Case {index + 1}: Passed")
        else:
            print(f"Test Case {index + 1}: Failed")
            print(f"  Expected: {test_case['expected']}")
            print(f"  Received: {result}")

test_max_profit()