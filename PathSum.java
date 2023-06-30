class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class PathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.val == targetSum && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        // Test case 1: Tree is empty, expected output: false
        boolean result = hasPathSum(null, 10);
        System.out.println(result == false);

        // Test case 2: Single root node with value 5, target sum is 5, expected output: true
        TreeNode root = new TreeNode(5, null, null);
        result = hasPathSum(root, 5);
        System.out.println(result == true);

        // Test case 3: Single root node with value 5, target sum is 10, expected output: false
        result = hasPathSum(root, 10);
        System.out.println(result == false);

        // Test case 4: Binary tree with multiple nodes and target sum 22, expected output: true
        root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7, null, null),
                                new TreeNode(2, null, null)
                        ),
                        null
                ),
                new TreeNode(8,
                        new TreeNode(13, null, null),
                        new TreeNode(4, null,
                                new TreeNode(1, null, null)
                        )
                )
        );

        result = hasPathSum(root, 22);
        System.out.println(result == true);

        // Test case 5: Binary tree with multiple nodes and target sum 27, expected output: false
        result = hasPathSum(root, 27);
        System.out.println(result == false);
    }
}
