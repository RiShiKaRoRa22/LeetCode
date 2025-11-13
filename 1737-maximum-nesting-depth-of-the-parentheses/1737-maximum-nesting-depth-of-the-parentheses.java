class Solution {
    public int maxDepth(String s) {
        int open=0;
        int maxDepth=-1;

        for( char c: s.toCharArray()){
            if(c=='('){
                open++;
            }
            else if(c==')'){
                open--;
            }
            maxDepth= Math.max(maxDepth,open);

        }
        return maxDepth;
        
    }
}