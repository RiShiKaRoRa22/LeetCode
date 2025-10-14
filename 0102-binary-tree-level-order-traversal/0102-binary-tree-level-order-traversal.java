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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> res= new ArrayList<>();
        if(root==null){
            return res;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int k=q.size();
            int i=0;
            List<Integer> list= new ArrayList<>();
            while(i<k){
                TreeNode r=q.poll();
                list.add(r.val);
                if(r.left!=null)q.offer(r.left);
                if(r.right!=null)q.offer(r.right);
                i++;
            }
            res.add(list);
        }
        return res;
        
    }
}