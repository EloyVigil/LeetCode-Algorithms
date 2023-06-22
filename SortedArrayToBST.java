import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        if (nums.length == 1) return new TreeNode(nums[0]);

        int mid = nums.length / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
        return node;
    }

    public static void main(String[] args) {
        // Test Case 1: Empty array
        int[] nums = {};
        TreeNode root = sortedArrayToBST(nums);
        System.out.println(root); // Expected output: null

        // Test Case 2: Single element array
        nums = new int[]{5};
        root = sortedArrayToBST(nums);
        System.out.println(root); // Expected output: TreeNode@<some_address>

        // Test Case 3: Array with multiple elements
        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        root = sortedArrayToBST(nums);
        System.out.println(root);
        /* Expected output:
            TreeNode@<some_address>
            (structure of the tree)
        */
    }
}
