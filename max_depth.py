def maxDepth(root):
    if not root:
        return None
    maximum = max(maxDepth(root.left), maxDepth(root.right))
    return maximum + 1
