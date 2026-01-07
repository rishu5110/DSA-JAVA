class Solution {
    long maxProduct = 0;
    final int MOD = 1_000_000_007;

    // Compute total sum of tree
    long totalSum(TreeNode root) {
        if (root == null) return 0;
        return root.val + totalSum(root.left) + totalSum(root.right);
    }

    // Try splitting at every subtree
    long find(TreeNode root, long total) {
        if (root == null) return 0;

        long leftSum = find(root.left, total);
        long rightSum = find(root.right, total);
        long subtreeSum = root.val + leftSum + rightSum;

        long product = subtreeSum * (total - subtreeSum);
        maxProduct = Math.max(maxProduct, product);

        return subtreeSum;
    }

    public int maxProduct(TreeNode root) {
        if (root == null) return 0;

        long total = totalSum(root);
        find(root, total);
        return (int)(maxProduct % MOD);
    }
}
