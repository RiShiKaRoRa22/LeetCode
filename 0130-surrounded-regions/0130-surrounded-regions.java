class Solution {
    public void solve(char[][] board) {
        int m= board.length;
        int n= board[0].length;
        int[][] dup= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dup[i][j]=0;
            }
        } 
        for(int j=0;j<n;j++){
            if(board[0][j]=='O' && dup[0][j]==0){
                dfs(dup,board,0,j);
            }
        }
        for(int j=0;j<n;j++){
            if(board[m-1][j]=='O' && dup[m-1][j]==0){
                dfs(dup,board,m-1,j);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][0]=='O' && dup[i][0]==0){
                dfs(dup,board,i,0);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][n-1]=='O' && dup[i][n-1]==0){
                dfs(dup,board,i,n-1);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dup[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';    
                }
            }
        }
        
    }
    public void dfs(int[][] dup,char[][] board, int i,int j){
        dup[i][j]=1;
        if(i>0 && board[i-1][j]=='O' && dup[i-1][j]==0){
            dfs(dup,board,i-1,j);   
        }
        if(j>0 && board[i][j-1]=='O' && dup[i][j-1]==0){
            dfs(dup,board,i,j-1);
        }
        if(i<board.length-1 && board[i+1][j]=='O' && dup[i+1][j]==0){
            dfs(dup,board,i+1,j);
        }
        if(j<board[0].length-1 && board[i][j+1]=='O' && dup[i][j+1]==0){
            dfs(dup,board,i,j+1);
        }
        else{
            return;
        }
        
    }
}