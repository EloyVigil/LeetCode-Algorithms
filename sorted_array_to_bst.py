class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def sortedArrayToBST(nums):
    if not nums:
        return None
    if len(nums) == 1:
        return TreeNode(nums[0])

    mid = len(nums) // 2
    node = TreeNode(nums[mid])
    node.left = sortedArrayToBST(nums[:mid])
    node.right = sortedArrayToBST(nums[mid + 1:])
    return node

def printTree(root):
    if root is None:
        return
    print(root.val)
    printTree(root.left)
    printTree(root.right)

def testSortedArrayToBST():
    # Test Case 1: Empty array
    nums = []
    root = sortedArrayToBST(nums)
    printTree(root)  # Expected output: None

    # Test Case 2: Single element array
    nums = [5]
    root = sortedArrayToBST(nums)
    printTree(root)  # Expected output: 5

    # Test Case 3: Array with multiple elements
    nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    root = sortedArrayToBST(nums)
    printTree(root)
    """ Expected output:
        5
        2
        1
        3
        8
        6
        7
        9
    """

testSortedArrayToBST()