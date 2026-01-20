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
    Map<Integer, Integer> inMap= new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int k=0;
        for(int i: inorder){
            inMap.put(i,k++);
        }

        TreeNode root= build(inorder,0,inorder.length-1, postorder, 0, postorder.length-1);
        return root;
    }
    public TreeNode build(int[] inorder,int inStart,int inEnd,int[] postorder,int pStart, int pEnd){
        if(pStart>pEnd || inStart > inEnd){
            return null;
        }
        TreeNode root= new TreeNode(postorder[pEnd]);
        int ind=inMap.get(root.val);
        int lefts= inEnd-ind;

        root.left=build(inorder,inStart,ind-1,postorder,pStart,pEnd-lefts-1);
        root.right=build(inorder,ind+1,inEnd,postorder,pStart,pEnd-1);
        return root;
    }
}