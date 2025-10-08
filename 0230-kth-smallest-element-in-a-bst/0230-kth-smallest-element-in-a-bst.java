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
    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> result= new ArrayList<>();
        inorder(root, result);
        TreeNode ans= result.get(k-1);
        return ans.val;

        
    }

    public void inorder(TreeNode root, List<TreeNode> result){
        if(root==null){
            return ;
        }
        inorder(root.left, result);
        result.add(root);
        inorder(root.right, result);
    }
}