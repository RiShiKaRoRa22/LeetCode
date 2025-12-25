class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer> map= new HashMap<>();
        int i=0;
        int j=0;
        int total=0;
        map.put('a',0);
        map.put('b',0);
        map.put('c',0);
        while(j<s.length() && i<s.length() ){
            map.put(s.charAt(j),map.get(s.charAt(j))+1);
            
            while(containsOcc(map)){
                total=total+s.length()-j;
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;   
            }
            j++;
        }
        return total;         
    }
    public boolean containsOcc(Map<Character,Integer> map){
        for(int i: map.values()){
            if(i==0){
                return false;
            }
        }
        return true;
    }
}