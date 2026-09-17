class Solution {
    public void dfs(int i, List<List<Integer>> graph, boolean[] visited){
        visited[i]=true;
        for(int k=0;k<graph.get(i).size();k++){
            if(!visited[graph.get(i).get(k)]){
                dfs(graph.get(i).get(k), graph, visited);
            }
        }
    }
    public boolean validTree(int n, int[][] edges) {
        if(edges.length>=n){
            return false;
        }
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int[] edge = edges[i];
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        int cnt=0;
        boolean[] visited = new boolean[n];
        for(int i=0;i<graph.size();i++){
                if(!visited[i]){
                    cnt++;
                    dfs(i,graph,visited);
                }
            
        }
        if(cnt>1){
            return false;
        }
        return cnt==1&&edges.length==n-1;
    }
}
