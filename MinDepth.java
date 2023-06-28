import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        if (root.left == null && root.right == null) return depth;

        while (!queue.isEmpty()) {
            int queueLength = queue.size();

            for (int i = 0; i < queueLength; i++) {
                TreeNode node = queue.poll();

                if (node.left == null && node.right == null) return depth;
                else {
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
            }

            depth++;
        }

        return depth;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
