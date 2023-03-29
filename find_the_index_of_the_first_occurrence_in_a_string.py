def strStr(haystack: str, needle: str) -> int:
    if needle == "": # If 'needle' is an empty string, return -1
        return -1
    # Iterate over each character in 'haystack' until the last character of 'needle' can fit in the remaining length of 'haystack'
    for i in range(len(haystack) - len(needle) + 1):
        str = "" # Initialize an empty string 'str' for each iteration
        # Iterate over each character in the substring of 'haystack' starting from the ith index and with a length equal to the length of 'needle'
        for j in range(i, i + len(needle)):
            str += haystack[j] # Append each character to the 'str' string
        if str == needle: # If the 'str' string matches 'needle'
            return i # Return the index at which the substring containing 'needle' starts in 'haystack'
    return -1 # If 'needle' is not found in 'haystack', return -1


def testStrStr():
    # Test Case 1
    haystack1 = "hello"
    needle1 = "ll"
    expected1 = 2
    result1 = strStr(haystack1, needle1)
    print("PASS" if result1 == expected1 else "FAIL")

    # Test Case 2
    haystack2 = "aaaaa"
    needle2 = "bba"
    expected2 = -1
    result2 = strStr(haystack2, needle2)
    print("PASS" if result2 == expected2 else "FAIL")

    # Test Case 3
    haystack3 = ""
    needle3 = ""
    expected3 = 0
    result3 = strStr(haystack3, needle3)
    print("PASS" if result3 == expected3 else "FAIL")


testStrStr()