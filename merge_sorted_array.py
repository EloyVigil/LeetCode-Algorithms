def merge(nums1, m, nums2, n):
    nums1Copy = nums1[:m]

    i = 0
    j = 0
    k = 0

    while i < m and j < n:
        if nums1Copy[i] <= nums2[j]:
            nums1[k] = nums1Copy[i]
            i += 1
        else:
            nums1[k] = nums2[j]
            j += 1
        k += 1

    while i < m:
        nums1[k] = nums1Copy[i]
        i += 1
        k += 1

    while j < n:
        nums1[k] = nums2[j]
        j += 1
        k += 1

    nums1.sort()


def runTest(nums1, m, nums2, n, expected):
    nums1Copy = nums1.copy()

    merge(nums1, m, nums2, n)

    if nums1 == expected:
        print("pass")
    else:
        print("fail")
        print("Expected:", expected)
        print("Actual:", nums1Copy)


# Run the test cases
runTest([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3, [1, 2, 2, 3, 5, 6])
runTest([1], 1, [], 0, [1])
runTest([0], 0, [1], 1, [1])
runTest([4, 5, 6, 0, 0, 0], 3, [1, 2, 3], 3, [1, 2, 3, 4, 5, 6])
runTest([4, 5, 6, 0, 0, 0], 3, [1, 2, 3], 3, [1, 2, 4, 5, 6, 6])
