class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        
        //Intuition : if 1, perform bfs and increase count by 1, turn visited 0, loop thru each row
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]-'0'==1){
                    Queue<Integer> q= new LinkedList<>();
                    bfs(grid,i,j,q);
                    count++;
                }
            }
        }
        return count;

        
    }
    public void bfs(char[][] grid,int i,int j,Queue<Integer> q){
        grid[i][j]='0';
        //check right and below if 1, add to queue both and then for q size run loop
        
        if(i<grid.length-1 && grid[i+1][j]-'0'==1  ){
            q.offer(i+1);
            q.offer(j);
            grid[i+1][j]='0';
        }
        if(j<grid[0].length-1 && grid[i][j+1]-'0'==1 ){
            q.offer(i);
            q.offer(j+1);
            grid[i][j+1]='0';
        }
        if(i>0 && grid[i-1][j]-'0'==1 ){
            q.offer(i-1);
            q.offer(j);
            grid[i-1][j]='0';
        }
        if(j>0 && grid[i][j-1]-'0'==1 ){
            q.offer(i);
            q.offer(j-1);
            grid[i][j-1]='0';
        }
        while(!q.isEmpty()){
            int a=q.poll();
            int b=q.poll();
            bfs(grid, a,b,q);
        }


    }
}