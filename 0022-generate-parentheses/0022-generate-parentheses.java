class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        int open=0;
        int close=0;
        
        backtrc(n,ans,sb,open,close);
        return ans;
        
    }
    public void backtrc(int n, List<String> ans, StringBuilder sb, int open, int close){
        if(sb.length()==(2*n)){
            ans.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append("(");
            backtrc(n,ans,sb,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open>close){
            sb.append(")");
            backtrc(n,ans,sb,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
}