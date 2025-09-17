class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int high=nums.length-1;
        while(start<high){
        int mid= (start+high)/2;
        
        if(nums[high]>nums[mid]){
            high=mid;
        }
        else if(nums[high]<nums[mid]){
            start=mid+1;
        }
        else if(nums[mid+1]<nums[mid]){
            return nums[mid+1];
        }
        else if(nums[mid]<nums[mid-1]){
            return nums[mid];
        }


        }
        return nums[start]; //??????? what
        
        
    }
}