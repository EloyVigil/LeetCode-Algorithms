from collections import deque

class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def min_depth(root):
    if not root:
        return 0

    depth = 1
    queue = deque([root])

    if not root.left and not root.right:
        return depth

    while queue:
        queue_length = len(queue)

        for _ in range(queue_length):
            node = queue.popleft()

            if not node.left and not node.right:
                return depth
            else:
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

        depth += 1

    return depth
