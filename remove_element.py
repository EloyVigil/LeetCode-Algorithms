def removeElement(nums, val):
    while val in nums:
        nums.remove(val)
    return len(nums)

def testRemoveElement():
    # Test Case 1
    arr1 = [3, 2, 2, 3]
    val1 = 3
    expectedOutput1 = 2
    actualOutput1 = removeElement(arr1, val1)
    assert actualOutput1 == expectedOutput1
    print('Test Case 1 Passed')
    
    # Test Case 2
    arr2 = [0, 1, 2, 2, 3, 0, 4, 2]
    val2 = 2
    expectedOutput2 = 5
    actualOutput2 = removeElement(arr2, val2)
    assert actualOutput2 == expectedOutput2
    print('Test Case 2 Passed')
    
    # Test Case 3
    arr3 = []
    val3 = 0
    expectedOutput3 = 0
    actualOutput3 = removeElement(arr3, val3)
    assert actualOutput3 == expectedOutput3
    print('Test Case 3 Passed')
    
    # Test Case 4
    arr4 = [1, 2, 3, 4]
    val4 = 5
    expectedOutput4 = 4
    actualOutput4 = removeElement(arr4, val4)
    assert actualOutput4 == expectedOutput4
    print('Test Case 4 Passed')

testRemoveElement()
