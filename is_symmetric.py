class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def isSymmetric(root):
    if not root:
        return True
    return isSame(root.left, root.right)

def isSame(leftroot, rightroot):
    if (not leftroot and rightroot) or (leftroot and not rightroot) or (leftroot and rightroot and leftroot.val != rightroot.val):
        return False
    if leftroot and rightroot:
        return isSame(leftroot.left, rightroot.right) and isSame(leftroot.right, rightroot.left)
    return True
