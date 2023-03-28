var removeElement = function (nums, val) {
    while (nums.indexOf(val) !== -1) {
        nums.splice(nums.indexOf(val), 1)
    }
    return nums.length;
};

// // Import assert module
// const assert = require('assert');

// // Test the removeElement function
// describe('removeElement', function () {
//     // Define the removeElement function
//     const removeElement = function (nums, val) {
//         while (nums.indexOf(val) !== -1) {
//             nums.splice(nums.indexOf(val), 1)
//         }
//         return nums.length;
//     };

//     it('should remove all occurrences of the value and return the new length', function () {
//         assert.strictEqual(removeElement([3, 2, 2, 3], 3), 2);
//         assert.strictEqual(removeElement([0, 1, 2, 2, 3, 0, 4, 2], 2), 5);
//     });

//     it('should return 0 when the array is empty', function () {
//         assert.strictEqual(removeElement([], 0), 0);
//     });

//     it('should return the length of the array when the value is not in the array', function () {
//         assert.strictEqual(removeElement([1, 2, 3, 4], 5), 4);
//     });
// });


const assert = require('assert');

function testRemoveElement() {
    // Test Case 1
    const arr1 = [3, 2, 2, 3];
    const val1 = 3;
    const expectedOutput1 = 2;
    const actualOutput1 = removeElement(arr1, val1);
    assert.strictEqual(actualOutput1, expectedOutput1);
    console.log('Test Case 1 Passed');

    // Test Case 2
    const arr2 = [0, 1, 2, 2, 3, 0, 4, 2];
    const val2 = 2;
    const expectedOutput2 = 5;
    const actualOutput2 = removeElement(arr2, val2);
    assert.strictEqual(actualOutput2, expectedOutput2);
    console.log('Test Case 2 Passed');

    // Test Case 3
    const arr3 = [];
    const val3 = 0;
    const expectedOutput3 = 0;
    const actualOutput3 = removeElement(arr3, val3);
    assert.strictEqual(actualOutput3, expectedOutput3);
    console.log('Test Case 3 Passed');

    // Test Case 4
    const arr4 = [1, 2, 3, 4];
    const val4 = 5;
    const expectedOutput4 = 4;
    const actualOutput4 = removeElement(arr4, val4);
    assert.strictEqual(actualOutput4, expectedOutput4);
    console.log('Test Case 4 Passed');
}

testRemoveElement();