def searchInsert(nums, target):
    start = 0
    end = len(nums) - 1
    if target < nums[0]:
        return 0
    elif target > nums[end]:
        return end + 1
    while start <= end:
        mid = (start + end) // 2
        if target < nums[mid]:
            end = mid - 1
        elif target > nums[mid]:
            start = mid + 1
        else:
            return mid
    return start

def testSearchInsert():
    nums = [1, 3, 5, 6]
    target = 5
    expected = 2
    result = searchInsert(nums, target)
    print("PASS" if result == expected else "FAIL")

testSearchInsert()