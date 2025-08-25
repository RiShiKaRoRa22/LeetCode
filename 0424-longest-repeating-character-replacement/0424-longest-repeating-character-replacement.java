class Solution {
    public int characterReplacement(String s, int k) {
        char c[]= s.toCharArray();
        int n=0;
        int freq[]= new int[26];
        int maxfrq=0;
        
        
        int i=0;
        int j=0;
        char first= c[0];
        while(i<c.length){ 
            freq[c[i]-'A']++;
            maxfrq=Math.max(maxfrq, freq[c[i]-'A']);
            n=(i-j+1)-maxfrq;
            while(n>k){
                freq[c[j]-'A']--;
                j++;
                n=(i-j +1)-maxfrq;
            }
            i++;
            
        }
        return (i-j);
        
    }
}