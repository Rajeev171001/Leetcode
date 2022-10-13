class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> list=new ArrayList<Integer>();
    //     dfs(root,list);
    //     return list;
    // }
    // private void dfs(TreeNode node, List<Integer>list){
    //     if(node==null) return;
    //     list.add(node.val);
    //     dfs(node.left, list);
    //     dfs(node.right,list);
    // }
        List<Integer> list=new LinkedList<Integer>();
        Stack<TreeNode> stac=new Stack<TreeNode>();
        while(root!=null){
            list.add(root.val);
            if(root.right!=null){
                stac.push(root.right);
            }
            if(root.left==null && !stac.isEmpty()){
                root=stac.pop();
            }else{
                root=root.left;
            }
        }
        return list;
    }
        
}
