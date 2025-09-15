import java.util.StringTokenizer;
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        StringTokenizer st= new StringTokenizer(text," ");
        int count=0;
        char[] bl= brokenLetters.toCharArray();
        int len=0;
        while(st.hasMoreTokens()){
            len++;

            String s= st.nextToken();
            for(char c: bl){
                if(s.contains(String.valueOf(c))){
                    count++;
                    break;
                }
            }
            
        }
        return len-count;
        
    }
}