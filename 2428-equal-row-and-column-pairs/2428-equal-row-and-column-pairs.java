class Solution {
    public int equalPairs(int[][] grid) {
        int i=0;
        int j=0;
        int k=0;
        int count=0;
        int flag=0;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid.length;j++){
                flag=0;
                for(k=0;k<grid.length;k++){
                    if(grid[i][k]!=grid[k][j]){
                        flag=1;
                    }
                    
                }
                if (flag==0){
                    count++;

                }
            }
        
        }
        return count;

        }
        

        
    }
