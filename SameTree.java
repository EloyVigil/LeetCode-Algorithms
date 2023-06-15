class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if ((p == null && q != null) || (p != null && q == null) || p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void testIsSameTree() {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        System.out.println(isSameTree(tree1, tree2)); // Expected output: true

        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(2);

        TreeNode tree4 = new TreeNode(1);
        tree4.right = new TreeNode(2);

        System.out.println(isSameTree(tree3, tree4)); // Expected output: false

        TreeNode tree5 = new TreeNode(1);
        tree5.left = new TreeNode(2);
        tree5.right = new TreeNode(1);

        TreeNode tree6 = new TreeNode(1);
        tree6.left = new TreeNode(1);
        tree6.right = new TreeNode(2);

        System.out.println(isSameTree(tree5, tree6)); // Expected output: false
    }

    public static void main(String[] args) {
        testIsSameTree();
    }
}

