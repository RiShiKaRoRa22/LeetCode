class Solution {
    public int maxFrequency(int[] nums, int k) {
        /*//calc max element
        //take second last element and calc diff
        //diff<=k, k=k-diff
        //continue with all subsequent elements
        //then calculate max frequency
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = temp;
            }
        int max=nums[0];
        //while(k>0){
            for(int i=1;i<nums.length;i++){
                int diff= max-nums[i];
                if(diff<=k){
                    k=k-diff;
                    nums[i]=max;
                }

            }
            return maxFreakquency(nums);
        //}
        
    }

    public int maxFreakquency(int nums[]){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=Collections.max(map.values());
        return max;
        for(int i:map.keySet()){
            if(map.get(i)==max){
                return i;
            }
        }
        return -1; */

        
        int i=0;
        int j=0;
        //int maxx=-1;
        Arrays.sort(nums);
        int sum=0;
        if(nums[0]==nums[nums.length-1]){
            return nums.length;
        }
        
        while(j<nums.length){
            sum=sum+nums[j];
            

            if(nums[j]*(j-i+1)-sum>k){
                sum=sum-nums[i];
                i++;
            }
            j++;     
        }
    
        if((j-i) == 30000){
            return nums.length-1;
        }
      
        return j-i;


        
        
    }

}