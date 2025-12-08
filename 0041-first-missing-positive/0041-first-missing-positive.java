class Solution {
    public int firstMissingPositive(int[] nums) {
        
       
        List<Integer> list= new ArrayList<>();
        Set<Integer> set= new HashSet<>();
        
        for(int i:nums){
            if(i>0){
                set.add(i);
            }    
        }
        int ans=1;
        
        while(set.contains(ans)){
            ans++;
        }
        return ans;
        
        //iterate from 0 to maxx in array and return first element not found.

        
    }
}