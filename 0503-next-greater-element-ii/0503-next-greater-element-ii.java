class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int result[]= new int[nums.length];
        Stack<Integer> stack= new Stack<>();
        for(int i=(nums.length-1)*2;i>=0;i--){
            int ind=i%nums.length;
            while(!stack.isEmpty() && stack.peek()<=nums[ind]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[ind]=-1;
            }
            else{
                result[ind]=stack.peek();
            }
            stack.push(nums[ind]);
        }
        
        return result;
        
    }
}