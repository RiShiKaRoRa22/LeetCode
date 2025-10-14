class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxx=0;
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if(nums[i]==0){
                count=0;
            }

            maxx=Math.max(count,maxx);
        }
        return maxx;
        
    }
}