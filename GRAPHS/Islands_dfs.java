package CP.GRAPHS;

public class Islands_dfs {

    public static void dfs(char [][] grid,int [][] vis, int r, int c){
        vis[r][c]=1;
        int n=grid.length;
        int m=grid[0].length;
//        int delr[]={-1,-1,0,1,1,1,0,-1};
//        int delc[]={0,1,1,1,0,-1,-1,-1};
        int[] rm = {-1, 0, 1, 0};
        int[] cm = {0, 1, 0, -1};
        for(int i=0;i<8;i++){
            int nr=r+rm[i];
            int nc=c+cm[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]=='1' && vis[nr][nc]==0 ){
                dfs(grid,vis,nr,nc);
            }
        }
    }
    static int numIslands(char [][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    dfs(grid,vis,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char grid[][] = {{'0','1','1','1','0','0','0'},
                         {'0','0','1','1','0','1','0'}};
        System.out.println(numIslands(grid));

    }
}
