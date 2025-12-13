class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V= isConnected.length;
        int[] visited= new int[isConnected.length];
        Arrays.fill(visited,0);
        int count=0;
        Map<Integer,List<Integer>> adjlist= new HashMap<>();
        for(int i=0;i<V;i++){
            adjlist.put(i,new ArrayList<>());
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1){
                    adjlist.get(i).add(j);
                }

            }
        }
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                DFS(adjlist,visited,i);
                count++;
            }

        }
        return count;
        
    }
    public void DFS(Map<Integer,List<Integer>> adjlist, int[] visited,int node){
        visited[node]=1;
        for(int i: adjlist.get(node)){
            if(visited[i]==0){
                visited[i]=1;
                DFS(adjlist,visited,i);
            }
            
        }
    }
}