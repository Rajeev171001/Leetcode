/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        
        TreeNode templeft=root.left; //root.left store in temp variable
        TreeNode tempright=root.right;
        
        root.left=null; //to make left node = null
        
        flatten(templeft); //fatten recursive
        flatten(tempright);
        
        root.right=templeft; // root.right=root.left
        
        TreeNode current=root;
        while(current.right!=null) current=current.right; //jab tak root.right null nhi jo jata, agar ho gya to root.right jo ki temp variable me store h use add kr denge 
        current.right=tempright;
    }
}