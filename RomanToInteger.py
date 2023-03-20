def roman_to_int(s):
    roman_num = {
        'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000
    }
    num = 0
    for i in range(len(s)):
        current = roman_num[s[i]]
        next = roman_num[s[i + 1]] if i < len(s) - 1 else 0
        if current < next:
            num -= current
        else:
            num += current
    return num

def test_roman_to_int():
    assert roman_to_int('III') == 3, 'Test Case 1 Failed'
    assert roman_to_int('LVIII') == 58, 'Test Case 2 Failed'
    assert roman_to_int('MCMXCIV') == 1994, 'Test Case 3 Failed'
    print('All test cases passed')

test_roman_to_int()