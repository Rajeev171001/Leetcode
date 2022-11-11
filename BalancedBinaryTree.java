class Solution {
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        valid(root);
        return result;
    }
    public int valid(TreeNode root){
        if(root==null) return 0;
        int left=valid(root.left);
        int right=valid(root.right);
        if(Math.abs(left-right)>1) result=false;
        return 1+Math.max(left,right);
    }
}
