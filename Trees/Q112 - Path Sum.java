class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
           return false;
        boolean ans = false;
        int subSum = targetSum - root.val;
        if (subSum == 0 && root.left == null && root.right == null)
            return 
               (ans = true);
        if (root.left != null)
            ans = ans || hasPathSum(root.left, subSum);
        if (root.right != null)
            ans = ans || hasPathSum(root.right, subSum);
        return (ans);
    }
}