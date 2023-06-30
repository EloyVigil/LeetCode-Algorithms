
//  * Definition for a binary tree node.
function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}


const hasPathSum = (root, targetSum) => {
    // If the tree is empty i.e. root is NULL, return false...
    if (root == null) return false;
    // If there is only a single root node and the value of root node is equal to the targetSum...
    if (root.val == targetSum && (root.left == null && root.right == null)) return true;
    // Call the same function recursively for left and right subtree...
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
};

function testHasPathSum() {
    // Test case 1: Tree is empty, expected output: false
    let result = hasPathSum(null, 10);
    console.log(result === false);

    // Test case 2: Single root node with value 5, target sum is 5, expected output: true
    let root = new TreeNode(5);
    result = hasPathSum(root, 5);
    console.log(result === true);

    // Test case 3: Single root node with value 5, target sum is 10, expected output: false
    result = hasPathSum(root, 10);
    console.log(result === false);

    // Test case 4: Binary tree with multiple nodes and target sum 22, expected output: true
    root = new TreeNode(5);
    root.left = new TreeNode(4);
    root.right = new TreeNode(8);
    root.left.left = new TreeNode(11);
    root.left.left.left = new TreeNode(7);
    root.left.left.right = new TreeNode(2);
    root.right.left = new TreeNode(13);
    root.right.right = new TreeNode(4);
    root.right.right.right = new TreeNode(1);

    result = hasPathSum(root, 22);
    console.log(result === true);

    // Test case 5: Binary tree with multiple nodes and target sum 27, expected output: false
    result = hasPathSum(root, 27);
    console.log(result === false);
}

// Run the test function
testHasPathSum();
