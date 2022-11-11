class Solution {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return ans;
    }

    public void traverse(TreeNode root){
        if(root==null) return;
        traverse(root.left);
        traverse(root.right);
        ans.add(root.val);
    }
}
