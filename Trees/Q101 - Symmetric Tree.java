class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSym(root.left,root.right);
    }
    public boolean isSym(TreeNode lef,TreeNode rig)
    {
        if(lef==null && rig==null)
        return true;
        if(lef==null && rig!=null)
        return false;
        if(lef!=null && rig==null)
        return false;
        return (lef.val==rig.val) && isSym(lef.left,rig.right) && isSym(lef.right,rig.left);
    }
}
