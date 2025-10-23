import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        /*if(nums==null){
            return 0;
        }
        Set<Integer> set= new TreeSet<>();
        for(int num: nums){
            int n=num;
            set.add(num);
        }
        
        int maxx=0;
        int curr=0;
        for(int num: set){
            if(!set.contains(num-1)){
                int start= num;
                curr=1;
                while(set.contains(start+1)){
                    curr++;
                    start++;
                }
                maxx=Math.max(maxx,curr);
            } 
        }
        return maxx; */ 
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int maxx=1;
        int count=1;


        for(int i=1;i<nums.length;i++){
            if(nums[i]-1==nums[i-1]){
                count++;
            }
            else if(nums[i]==nums[i-1]){
                continue;
            }
            else{
                count=1;
            }
            maxx=Math.max(maxx,count);


        }
        return maxx;

    }
}