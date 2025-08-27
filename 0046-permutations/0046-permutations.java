class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list= new ArrayList<>();
        int[] used= new int[nums.length];
        List<List<Integer>> ans= new ArrayList<>();
        backtrc(nums,ans,list,used);
        return ans;

    }

    public void backtrc(int[] nums, List<List<Integer>> ans, List<Integer> list, int[] used){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==0){
                 list.add(nums[i]);
            used[i]=1;
            backtrc(nums,ans,list,used);
            list.remove(list.size()-1);
            used[i]=0;

            }
           
    

        }
    }
}