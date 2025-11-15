class Solution {
    public String longestPalindrome(String s) {
        //String result=null;
        Map<Integer,String> map= new HashMap<>();
        if(s.length()==1){
            return s;
        }

        int i=0;
        int maxLen=-1;
        while(i<s.length()){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1))){
                    int len=j-i;
                    maxLen=Math.max(maxLen,len);
                    map.put(len,s.substring(i,j+1));
                }
            }
            i++;

        }
        return map.get(maxLen);
        
    }
    public boolean isPalindrome(String str){
        if(str.length()==1){
            return true;
        }
        int i=0;
        int j=str.length()-1;
        
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){

            }
            else{
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}