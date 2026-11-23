
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaxDepthTree {

    public static int maxDepth(TreeNode root) {

        // Base condition
        if (root == null) {
            return 0;
        }

        // Recursive calls
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Return maximum depth
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {

        // Create binary tree
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Call method
        int result = maxDepth(root);

        // Print output
        System.out.println("Maximum Depth: " + result);
    }
}
