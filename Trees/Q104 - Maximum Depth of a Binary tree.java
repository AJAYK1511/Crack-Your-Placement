class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        else{
        int lefd=maxDepth(root.left);
        int rigd=maxDepth(root.right);
        if(lefd>rigd)
        {
            return lefd+1;
        }
        else
        return rigd+1;}
    }
}