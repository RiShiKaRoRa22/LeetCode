class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int og= image[sr][sc];
        image[sr][sc]=color;
        Queue<Integer> q= new LinkedList<>();
        q.offer(sr);
        q.offer(sc);
        if(og==color){
            return image;
        }
        while(!q.isEmpty()){
            int a=q.poll();
            int b=q.poll();
            if(a<image.length-1 && image[a+1][b]==og){
                q.offer(a+1);
                q.offer(b);
                image[a+1][b]=color;   
            }

            if(b<image[0].length-1 && image[a][b+1]==og){
                q.offer(a);
                q.offer(b+1);
                image[a][b+1]=color;
            }

            if(a>0 && image[a-1][b]==og){
                q.offer(a-1);
                q.offer(b);
                image[a-1][b]=color;   
            }
            if(b>0 && image[a][b-1]==og){
                q.offer(a);
                q.offer(b-1);
                image[a][b-1]=color;   
            }    
        }
        return image;

        
    }
}