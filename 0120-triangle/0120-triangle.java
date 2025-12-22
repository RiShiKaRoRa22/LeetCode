class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size=triangle.size();
        for(int i=size-2;i>=0;i--){
            int j=triangle.get(i).size();
            for(int k=0;k<j;k++){
                int min=Math.min(triangle.get(i+1).get(k),triangle.get(i+1).get(k+1));
                triangle.get(i).set(k,min+triangle.get(i).get(k));

            }


        }
        return triangle.get(0).get(0);
        
        
    }
}