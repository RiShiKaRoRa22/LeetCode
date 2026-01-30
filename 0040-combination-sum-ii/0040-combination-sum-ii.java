class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        /*boolean visited[]= new boolean[candidates.length];
        Arrays.fill(visited,false);*/

        List<Integer> list= new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        backtrack(candidates,target,res,list,0);
        return res;

        
    }
    public void backtrack( int[] candidates, int target, List<List<Integer>> res, List<Integer> list, int ind){
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]){
                continue;
            }
            
                list.add(candidates[i]);
                //visited[i]=true;
                // dont modify target directly target=target-candidates[i];
                backtrack(candidates,target-candidates[i],res,list,i+1);
                list.remove(list.size()-1);
            
            
        }
    }

}