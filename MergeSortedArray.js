const merge = (nums1, m, nums2, n) => {
    nums1.splice(m);
    nums2.splice(n);
    
    for(let i = 0; i < n; i++)
        nums1.push(nums2[i]);
    
    nums1.sort((a,b) => a-b);
};

const runTest = (nums1, m, nums2, n, expected) => {
    // Make a copy of nums1 to compare the result
    const nums1Copy = [...nums1];
    
    // Call the merge function
    merge(nums1, m, nums2, n);
    
    // Check if nums1 is equal to the expected result
    if (JSON.stringify(nums1) === JSON.stringify(expected)) {
        console.log("pass");
    } else {
        console.log("fail");
        console.log("Expected:", expected);
        console.log("Actual:", nums1Copy);
    }
}

// Run the test cases
runTest([1,2,3,0,0,0], 3, [2,5,6], 3, [1,2,2,3,5,6]);
runTest([1], 1, [], 0, [1]);
runTest([0], 0, [1], 1, [1]);
runTest([4,5,6,0,0,0], 3, [1,2,3], 3, [1,2,3,4,5,6]);
runTest([4, 5, 6, 0, 0, 0], 3, [1, 2, 3], 3, [1, 2, 4, 5, 6, 6]);