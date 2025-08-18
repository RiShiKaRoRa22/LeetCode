class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> str= new ArrayList<>();
        if(digits.length()==0){
            return str;
        }

        Map<Character,String> map= new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        StringBuilder sb= new StringBuilder();
    

        backtrack(str,sb,map,digits,0);

        return str;   
    }

    public void backtrack(List<String> ans, StringBuilder sb, Map<Character,String> map, String digits, int index){
        if(index==digits.length()){
            ans.add(sb.toString());
            return ;
        }
        char b= digits.charAt(index);
        String a= map.get(b);
        for(char c: a.toCharArray()){
            sb.append(c);
            backtrack(ans,sb,map,digits,index+1);
            sb.deleteCharAt(index);

        }

    }
}