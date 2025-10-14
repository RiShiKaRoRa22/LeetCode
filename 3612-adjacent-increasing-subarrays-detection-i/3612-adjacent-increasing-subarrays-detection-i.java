class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int i=0;
        int j=2*k;
        while(j<=nums.size()){
            int mid=(i+j)/2;
            if(increasing(nums,i,mid)==true && increasing(nums,mid,j)==true){
                return true;
            }
            i++;
            j++;
        }
        return false;    
    }

    public boolean increasing(List<Integer> list, int start, int end){
        for(int i=start;i<end-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
            /*else if(list.get(i)<0 && list.get(i+1)<0 && Math.abs(list.get(i))<=Math.abs(list.get(i+1))){
                return false;
            }*/
        }
        return true;
    }
}