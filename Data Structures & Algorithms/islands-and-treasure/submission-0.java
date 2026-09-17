class Solution {
    public boolean isValid(int i,int j, int[][] grid, int n, int m){
        return i>=0 && i<n && j>=0 && j<m && grid[i][j]==Integer.MAX_VALUE;
    }
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[] xarr = {-1,1,0,0};
        int[] yarr = {0,0,-1,1};
        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                int[] pos = q.poll();
                for(int p=0;p<4;p++){
                    int nx = pos[0]+xarr[p];
                    int ny = pos[1]+yarr[p];
                    if(isValid(nx,ny,grid, n, m)){
                        grid[nx][ny]=grid[pos[0]][pos[1]]+1;
                        q.offer(new int[]{nx,ny});
                    }
                }
            }
        }
    }
}
