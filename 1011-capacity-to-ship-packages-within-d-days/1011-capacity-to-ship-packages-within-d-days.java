class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i:weights){
            max=Math.max(max,i);
            sum=sum+i;
        }
        int low=max;
        int high=sum;
        while(low<high){
            int mid=(low+high)/2;
            if(withinDays(weights,days,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;

        
    }
    public boolean withinDays(int[] wts, int days, int wt){
        int sum=0;
        int cnt=1;
        int j=0;
        for(int i:wts){
            if(sum+i>wt){
                sum=0;
                cnt++;
            }
            sum=sum+i;    
        }
        
        return(cnt<=days);
    }
}