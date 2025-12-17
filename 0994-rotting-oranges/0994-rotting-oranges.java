class Solution {
    

    public int orangesRotting(int[][] grid) {
        //intuition: connected components, if all components connect then return no. of times bfs runs
        int mins=0;
        Queue<Integer> q= new LinkedList<>();
        int fresh=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(i);
                    q.offer(j);    
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        
        while(!q.isEmpty()){
            int k=q.size()/2;
            mins++;
            for(int var=0;var<k;var++){
                int a=q.poll();
                int b= q.poll();
            
                grid[a][b]=2;
                if(a<grid.length-1 && grid[a+1][b]==1){
                    q.offer(a+1);
                    q.offer(b);
                    grid[a+1][b]=2;
                    fresh--;
                }

                if(b<grid[0].length-1 && grid[a][b+1]==1){
                    q.offer(a);
                    q.offer(b+1);
                    grid[a][b+1]=2;
                    fresh--;
                }

                if(a>0 && grid[a-1][b]==1){
                    q.offer(a-1);
                    q.offer(b);
                    grid[a-1][b]=2;
                    fresh--;
                }
                if(b>0 && grid[a][b-1]==1){
                    q.offer(a);
                    q.offer(b-1);
                    grid[a][b-1]=2;
                    fresh--;
                }
            }
                
        }
        if(fresh!=0){
            return -1;
        }
        if(mins==0){
            return fresh;
        }
        
        return mins-1;    
    }

    /*public void bfs(int[][] grid, int i, int j, int mins, Queue<Integer> q){
        mins++;
        grid[i][j]=2;
        if(i<grid.length-1 && grid[i+1][j]==1){
            q.offer(i+1);
            q.offer(j);
            grid[i+1][j]=2;
        }

        if(j<grid[0].length-1 && grid[i][j+1]==1){
            q.offer(i);
            q.offer(j+1);
            grid[i][j+1]=2;
        }

        if(i>0 && grid[i-1][j]==1){
            q.offer(i-1);
            q.offer(j);
            grid[i-1][j]=2;
        }
        if(j>0 && grid[i][j-1]==1){
            q.offer(i);
            q.offer(j-1);
            grid[i][j-1]=2;
        }

        while(!q.isEmpty()){
            int a=q.poll();
            int b= q.poll();
            bfs(grid,a,b,mins,q);
        }
    }*/
}