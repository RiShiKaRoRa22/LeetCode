class Solution {
    public int countPartitions(int[] nums) {
        int prefixsum[]= new int[nums.length];
        int suffixsum[]= new int[nums.length];
        int a=0;
        int sum=0;
        for(int i:nums){
            
            sum=sum+i;
            prefixsum[a]=sum;
            a++;

        }

        int sum2=0;
        int b=0;
        for(int j=nums.length-1;j>=0;j--){
            suffixsum[j]=sum2;
            sum2=sum2+nums[j];
        }
        int length=0;
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(suffixsum[i]-prefixsum[i])%2==0){
                length++;
            }
        }
        return length;
        
    }
}