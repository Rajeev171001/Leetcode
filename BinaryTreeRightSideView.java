class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList <Integer> ans = new ArrayList<Integer>();
        int level=0;
        rightView(root,level,ans);
        return ans ;
    }
    public void rightView(TreeNode root, int level, List <Integer> ans){
      
      if ( root == null){
        return ;
      }
	  
      if (ans.size()==level){
        ans.add(root.val);
      }
     //right side
      rightView(root.right ,level+1,ans);
     //left  side
      rightView(root.left ,level+1, ans);

    }
}



