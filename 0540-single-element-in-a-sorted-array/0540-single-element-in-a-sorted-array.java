class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length;
        while(start<=end){
            int mid= (start+end)/2;
            if( mid>0 && nums[mid]==nums[mid-1] && (mid-1)%2==0){
                start=mid+1;

            }
            else if( mid>0 && nums[mid]==nums[mid-1] && (mid-1)%2==1){
                end=mid-1;
            }
            else if(mid<nums.length-1 && nums[mid]==nums[mid+1] && mid%2==1){
                end=mid-1;

            }
            else if(mid<nums.length-1 && nums[mid]==nums[mid+1] && mid%2==0){
                start=mid+1;
            }
            else{
                return nums[mid];
            }
        }
        return -1;
        
    }
}