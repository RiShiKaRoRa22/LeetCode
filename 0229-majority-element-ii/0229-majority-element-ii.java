class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        int n= (int)Math.ceil((nums.length)/3);
        List<Integer> res= new ArrayList<>();

        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int j: map.keySet()){
            if(map.get(j)>n){
                res.add(j);
            }

        }
        return res;
        
    }
}