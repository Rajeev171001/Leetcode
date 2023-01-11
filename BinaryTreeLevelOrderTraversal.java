class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> currLevel = new ArrayList<>();
            while(size-- > 0) {
                TreeNode curr = q.poll();
                currLevel.add(curr.val);
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            result.add(currLevel);
        }
        return result;
    }
}
