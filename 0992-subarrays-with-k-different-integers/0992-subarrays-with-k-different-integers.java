class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int a=lessThan(nums,k);
        System.out.println(a);
        int b=lessThan(nums,k-1);
        System.out.println(b);

        return a-b;
        
    }

    public int lessThan(int nums[],int k){
        if(k<0){
            return 0;
        }
        int i=0;
        int j=0;
        Map<Integer,Integer> map= new HashMap<>();
        int count=0; 
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k && i<nums.length){  
                map.put(nums[i],map.getOrDefault(nums[i],1)-1);
                if(map.get(nums[i])==0)map.remove(nums[i]);
                i++;
            }
            count=count+(j-i+1);
            j++;
        }  
        return count; 
    }
}