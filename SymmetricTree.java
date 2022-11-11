class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymm(root.left,root.right);
    }

    private boolean isSymm(TreeNode leftnode, TreeNode rightnode){
        if(leftnode==null && rightnode==null) return true;
        if(leftnode==null || rightnode==null) return false;
        if(leftnode.val!=rightnode.val) return false;
        return isSymm(leftnode.left,rightnode.right) && isSymm(leftnode.right,rightnode.left);

    }
}
