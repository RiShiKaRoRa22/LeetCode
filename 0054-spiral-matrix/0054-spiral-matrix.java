class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows= matrix.length;
        int cols= matrix[0].length;
        List<Integer> res= new ArrayList<>();
        int k=rows*cols;
        int i;
        int j;
        int top=0;
        int bot=rows-1;
        int left=0;
        int right=cols-1;
        
    while(left<=right && top<=bot && res.size()<k){
        for(i=left;i<=right;i++){
            res.add(matrix[top][i]);
        }
        top++;
        for( j=top;j<=bot;j++){
            res.add(matrix[j][right]);
        }
        right--;
        if(top<=bot){
            for(i=right;i>=left;i--){
            res.add(matrix[bot][i]);
        }
        bot--;
        }
        if(left<=right){
            for(j=bot;j>=top;j--){
            res.add(matrix[j][left]);    
        }
        left++;

        }
        
        
        //as++;
        //bs++;

    }   
    return res;    
    }
}