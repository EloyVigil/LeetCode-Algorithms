
function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const sortedArrayToBST = (nums) => {
    if(nums.length == 0) return null;
    if(nums.length == 1) return new TreeNode(nums[0])
    let mid = Math.floor(nums.length * 0.5)
    var node = new TreeNode(nums[mid]);
    node.left = sortedArrayToBST(nums.slice(0, mid))
    node.right = sortedArrayToBST(nums.splice(mid +1))
    return node;
};

function testSortedArrayToBST() {
    // Test Case 1: Empty array
    let nums = [];
    let root = sortedArrayToBST(nums);
    console.log(root); // Expected output: null

    // Test Case 2: Single element array
    nums = [5];
    root = sortedArrayToBST(nums);
    console.log(root); // Expected output: TreeNode { val: 5, left: null, right: null }

    // Test Case 3: Array with multiple elements
    nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];
    root = sortedArrayToBST(nums);
    console.log(root);
    /* Expected output:
    TreeNode {
        val: 5,
        left: TreeNode {
            val: 2,
            left: TreeNode { val: 1, left: null, right: null },
            right: TreeNode { val: 3, left: null, right: null }
        },
        right: TreeNode {
            val: 8,
            left: TreeNode { val: 6, left: null, right: TreeNode { val: 7, left: null, right: null } },
            right: TreeNode { val: 9, left: null, right: null }
        }
    }
    */

}

testSortedArrayToBST();