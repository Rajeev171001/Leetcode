class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
       List<Integer> list=new ArrayList<Integer>();
        dfs(root,list);
        return list;
    }
    private void dfs(TreeNode node, List<Integer>list){
        if(node==null) return;
        
        dfs(node.left, list);
        list.add(node.val);
        dfs(node.right,list);
    }
}
