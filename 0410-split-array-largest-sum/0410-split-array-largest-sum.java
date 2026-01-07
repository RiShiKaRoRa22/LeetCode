class Solution {
    public int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i: nums){
            sum=sum+i;
            max=Math.max(max,i);
        }
        int high=sum;
        int low=max;
        while(low<high){
            int mid=(low+high)/2;
            if(isPossible(nums,mid,k)){
                high=mid;
            }
            else{
                low=mid+1;
            }    
        }
        return high;
        
    }
    public boolean isPossible(int[] arr, int maxsum, int k){
        int sum=0;
        int cnt=1;
        for(int i:arr){
            if(sum+i>maxsum){
                sum=0;
                cnt++;
            }
            sum=sum+i;
        }
        return (cnt<=k);
    }
}