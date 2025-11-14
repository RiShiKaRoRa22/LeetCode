class Solution {
    public int beautySum(String s) {
        
        int j=0;
        char chr[]= s.toCharArray();
        int sum=0;
        while(j<s.length()){
            int k=j;
            int freq[]= new int[26];
            Arrays.fill(freq,0);
            

            while(k<s.length()){
                int maxx=-1;
                int minn=500;
                freq[s.charAt(k)-'a']++; 
                k++;
                for(int i: freq){
                    if(i!=0){
                     maxx=Math.max(maxx,i);
                     minn= Math.min(minn,i);
                    }
                }
                sum=sum+(maxx-minn);
            }
            
            
            j++;
        }
        return sum;
    }
}