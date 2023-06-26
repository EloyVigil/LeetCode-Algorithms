public class IsBalanced {

    private boolean isBalanced = true;

    public boolean isTreeBalanced(TreeNode root) {
        getHeight(root);
        return isBalanced;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        if (Math.abs(rightHeight - leftHeight) > 1) {
            isBalanced = false;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
