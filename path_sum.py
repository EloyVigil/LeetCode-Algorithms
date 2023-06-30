class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def hasPathSum(root, targetSum):
    if root is None:
        return False
    if root.val == targetSum and root.left is None and root.right is None:
        return True
    return hasPathSum(root.left, targetSum - root.val) or hasPathSum(root.right, targetSum - root.val)

def testHasPathSum():
    # Test case 1: Tree is empty, expected output: False
    result = hasPathSum(None, 10)
    print(result == False)

    # Test case 2: Single root node with value 5, target sum is 5, expected output: True
    root = TreeNode(5)
    result = hasPathSum(root, 5)
    print(result == True)

    # Test case 3: Single root node with value 5, target sum is 10, expected output: False
    result = hasPathSum(root, 10)
    print(result == False)

    # Test case 4: Binary tree with multiple nodes and target sum 22, expected output: True
    root = TreeNode(5)
    root.left = TreeNode(4)
    root.right = TreeNode(8)
    root.left.left = TreeNode(11)
    root.left.left.left = TreeNode(7)
    root.left.left.right = TreeNode(2)
    root.right.left = TreeNode(13)
    root.right.right = TreeNode(4)
    root.right.right.right = TreeNode(1)

    result = hasPathSum(root, 22)
    print(result == True)

    # Test case 5: Binary tree with multiple nodes and target sum 27, expected output: False
    result = hasPathSum(root, 27)
    print(result == False)

# Run the test function
testHasPathSum()
