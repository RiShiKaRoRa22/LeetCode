class Solution {
    public boolean rotateString(String s, String goal) {
        char[] str= s.toCharArray();

        int i=0;
        while(i<str.length){
            char c=str[0];
            for(int j=1;j<str.length;j++){
                str[j-1]=str[j];

            }
            str[str.length-1]=c;

            if(String.valueOf(str).equals(goal)){
                return true;
            }

            i++;
        }

        

        return false;
    }
}