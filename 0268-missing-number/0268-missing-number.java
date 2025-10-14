class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int[] freq= new  int[n+1];
        for(int x:nums){
            freq[x]++;
        }
        int i=0;
        for( i=0;i<n;i++){
            if(freq[i]==0){
                break;
            }

        }
        return i;

        
    }
}