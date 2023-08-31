class TreeNode {
    
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSame(root.left, root.right);
    }

    private boolean isSame(TreeNode leftroot, TreeNode rightroot) {
        if ((leftroot == null && rightroot != null) || (leftroot != null && rightroot == null)
                || (leftroot != null && rightroot != null && leftroot.val != rightroot.val))
            return false;
        if (leftroot != null && rightroot != null)
            return isSame(leftroot.left, rightroot.right) && isSame(leftroot.right, rightroot.left);
        return true;
    }
}
