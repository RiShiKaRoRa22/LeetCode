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
    int maxarea;
    Solution(){
        maxarea=Integer.MIN_VALUE;
    }
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxarea;
    }
    public int maxPath(TreeNode root){
        
        if(root==null){
            return 0;
        }
        int l=maxPath(root.left);
        int r=maxPath(root.right);
        int leftmax=(l>=0?l:0);
        int rightmax=(r>=0?r:0);
        
        maxarea=Math.max(Math.max(maxarea,leftmax+rightmax+root.val),root.val);
        return Math.max(leftmax+root.val, rightmax+ root.val);
    }
}