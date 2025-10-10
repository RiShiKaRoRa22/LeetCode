import java.util.Arrays;
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int len= energy.length;
        int[] dp= new int[len];
        

        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=len-1;i>=0;i--){
            dp[i]= energy[i];
            if(i+k<len){
                dp[i]=dp[i]+dp[i+k];
            }
            
        }  
        Arrays.sort(dp);
        return dp[len-1]; 
    }
}