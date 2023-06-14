class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def inorder_traversal(root):
    answer = []
    stack = []

    if root is None:
        return []

    current = root

    while current is not None or len(stack) != 0:
        if current is not None:
            stack.append(current)
            current = current.left
        else:
            current = stack.pop()
            answer.append(current.val)
            current = current.right

    return answer
