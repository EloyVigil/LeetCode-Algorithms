class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None


def is_balanced(root):
    flag = [True]

    def get_height(node):
        if not node:
            return 0

        left_height = get_height(node.left)
        right_height = get_height(node.right)

        if abs(right_height - left_height) > 1:
            flag[0] = False

        return max(left_height, right_height) + 1

    get_height(root)

    return flag[0]
