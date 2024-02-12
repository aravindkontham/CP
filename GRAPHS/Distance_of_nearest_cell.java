package CP.GRAPHS;

import java.util.LinkedList;
import java.util.Queue;

public class Distance_of_nearest_cell {
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int dis[][]=new int[n][m];
        Queue<near> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new near(i,j,0));
                    vis[i][j]=1;
                }

            }
        }
        int[] rm = {-1, 0, 1, 0};
        int[] cm = {0, 1, 0, -1};
        while (!q.isEmpty()){
            int r=q.peek().r;
            int c=q.peek().c;
            int d=q.peek().d;
            dis[r][c]=d;
            q.remove();

            for(int i=0;i<n;i++){
                int nr=r+rm[i];
                int nc=c+cm[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==0 && vis[nr][nc]==0){
                    vis[nr][nc]=1;
                    q.add(new near(nr, nc, d+1));
                }
            }
        }
        return dis;
    }
    public static void main(String[] args) {

    }
}
class near{
    int r;
    int c;
    int d;
    public near(int r, int c, int d){
        this.r=r;
        this.c=c;
        this.d=d;
    }
}