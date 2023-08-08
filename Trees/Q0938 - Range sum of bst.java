class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        if(root==null)
        return 0;
            if(root.val>=low && root.val<=high)
            sum+=root.val;
        
        return sum + rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
    }
}