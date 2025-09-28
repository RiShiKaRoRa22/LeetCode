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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        List<Integer> list= new ArrayList<>();
        
        q.offer(root);
        int max=Integer.MIN_VALUE;

        while(!q.isEmpty()){
            int s=q.size();
            int sum=0;

            
            int i=0;
            while(i<s){
                TreeNode node= q.poll();
                sum=sum+node.val;

                if(node.left!=null){
                    q.offer(node.left);

                }
                if(node.right!=null){
                    q.offer(node.right);

                }
                
                i++;

            }
            list.add(sum);
            max=Math.max(max,sum);
            
            
        }
        return list.indexOf(max)+1;

    }
}