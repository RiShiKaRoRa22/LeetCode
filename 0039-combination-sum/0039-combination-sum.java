class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list= new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> candidate= new ArrayList<>();
        for(int i: candidates){
            candidate.add(i);
        }
        backtrc(candidate,0 ,target, list, res);
        return res;   
    }

    public void backtrc(List<Integer> can, int index, int target, List<Integer> list, List<List<Integer>> res){
       if(target<0){
        return;
       }

       if(target==0){
        res.add(new ArrayList<>(list));
        return;
       }
        for(int i= index; i<can.size(); i++){
            list.add(can.get(i));
            int t= target-can.get(i);
            backtrc(can,i,t,list,res);
            list.remove(list.size()-1);


        }

        
       
    }
}