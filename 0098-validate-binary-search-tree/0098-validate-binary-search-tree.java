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
    public boolean isValidBST(TreeNode root) {
        Long min= Long.MIN_VALUE;
        Long max= Long.MAX_VALUE;
       return minmaxvalidate(min,max,root);
   
    }

    public boolean minmaxvalidate(Long min, Long max,TreeNode root){
        if(root==null){
            return true;
        }
        if(root.val>=max || root.val<=min ){
            return false;
        }
        return minmaxvalidate(min,(long)root.val,root.left) && minmaxvalidate((long)root.val,max,root.right);
        
    }
}