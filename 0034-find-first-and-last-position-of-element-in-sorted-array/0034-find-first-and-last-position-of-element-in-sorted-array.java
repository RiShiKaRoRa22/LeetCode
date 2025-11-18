class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int[] res=new int[2];
        res[0]=binsearchfs(nums,target);
        res[1]=binsearchls(nums,target);
        return res;   
    }

    public int binsearchfs(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;

            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }

    public int binsearchls(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;

            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}