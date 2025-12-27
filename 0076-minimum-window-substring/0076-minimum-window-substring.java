class Solution {
    public String minWindow(String s, String t) {
        if(s.length()< t.length()){
            return "";
        }
        
        
        Map<Character,Integer> map1= new HashMap<>();
        Map<Character,Integer> map2= new HashMap<>();
        for(char i: t.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        int i=0;
        int j=0;
        int start=0;
        int minn=Integer.MAX_VALUE;
        while(j<s.length()){
            map2.put(s.charAt(j), map2.getOrDefault(s.charAt(j),0)+1);
            
            while(isThere(map1,map2) && i<s.length()){
                if(j-i+1<minn){
                    minn=j-i+1;
                    start=i;
                } 
                map2.put(s.charAt(i),map2.get(s.charAt(i))-1); 
                if(map2.get(s.charAt(i))==0)map2.remove(s.charAt(i));
                i++;    
            }
            j++;
        }

        return minn==Integer.MAX_VALUE?"":s.substring(start,start+minn);
    }
    public boolean isThere(Map<Character,Integer> map1, Map<Character,Integer> map2){
        for(char i:map1.keySet()){
            if(!map2.containsKey(i) || map2.get(i)<map1.get(i)){
                return false;
            }
        }
        return true;
    }
}