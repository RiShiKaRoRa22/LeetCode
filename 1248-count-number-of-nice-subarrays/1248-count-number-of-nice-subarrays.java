class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int a=lesserThan(nums,k);
        int b= lesserThan(nums,k-1);
        return a-b;

        
    }
    public int lesserThan(int[] nums, int k){
        if(k<0){
            return 0;
        }
        int i=0;
        int j=0;
        int countodd=0;
        int arrays=0;
        while(j<nums.length){
            if(nums[j]%2!=0){
                countodd++;
            }
            while(countodd>k && i<nums.length){
                if(nums[i]%2!=0){
                    countodd--;
                }
                i++;
            }
            arrays=arrays+(j-i+1);
            j++;

        }
        return arrays;
    }
}