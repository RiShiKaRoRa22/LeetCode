class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i=0;
        int j=0;
        int n=cardPoints.length-k;
        int sum=0;
        int Min=Integer.MAX_VALUE;
        int sumAll=0;
        for(int x:cardPoints){
            sumAll=sumAll+x;
        }
        while(j<cardPoints.length){ 
            sum=sum+cardPoints[j];
            while((j-i+1)>=n && i<cardPoints.length){
                Min=Math.min(Min,sum);
                sum=sum-cardPoints[i];
                i++;
                
            }
            
            j++;
            
        }
        return sumAll-Min;
        
        
    }
}