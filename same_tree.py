class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def is_same_tree(p, q):
    if not p and not q:
        return True
    if (p and not q) or (q and not p) or p.val != q.val:
        return False
    return is_same_tree(p.left, q.left) and is_same_tree(p.right, q.right)


def test_is_same_tree():
    tree1 = TreeNode(1)
    tree1.left = TreeNode(2)
    tree1.right = TreeNode(3)

    tree2 = TreeNode(1)
    tree2.left = TreeNode(2)
    tree2.right = TreeNode(3)

    print(is_same_tree(tree1, tree2))  # Expected output: True

    tree3 = TreeNode(1)
    tree3.left = TreeNode(2)

    tree4 = TreeNode(1)
    tree4.right = TreeNode(2)

    print(is_same_tree(tree3, tree4))  # Expected output: False

    tree5 = TreeNode(1)
    tree5.left = TreeNode(2)
    tree5.right = TreeNode(1)

    tree6 = TreeNode(1)
    tree6.left = TreeNode(1)
    tree6.right = TreeNode(2)

    print(is_same_tree(tree5, tree6))  # Expected output: False

test_is_same_tree()