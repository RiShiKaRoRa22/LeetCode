class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;

        int ans=0;
        for(int i: piles){
            high=Math.max(i,high);

        }
        while(low<=high){
            int mid= (low+high)/2;
            if(canfin(piles,h,mid)){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
        
    }

    public boolean canfin(int[] piles, int h, int mid){
        int hours=0;
        for(int i: piles){

            hours=hours+ (int)Math.ceil((double)i/mid);
        }
        if(hours<=h){
            return true;
        }
        return false;
    }
}