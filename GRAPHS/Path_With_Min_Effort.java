package CP.GRAPHS;

import java.util.PriorityQueue;

public class Path_With_Min_Effort {
    public static int MinimumEffort(int grid[][]) {
        int n=grid.length;
        int m=grid[0].length;
        int dis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dis[i][j]=(int)(1e9);
            }
        }
        dis[0][0]=0;
        PriorityQueue<path> pq=new PriorityQueue<path>((x,y)->x.d-y.d);
        pq.add(new path(0,0,0));
        int[] rm = {-1, 0, 1, 0};
        int[] cm = {0, 1, 0, -1};
        while (!pq.isEmpty()){
            int r=pq.peek().r;
            int c=pq.peek().c;
            int d=pq.peek().d;
            pq.remove();
            if(r==n-1 && c==m-1)
                return d;
            for(int i=0;i<4;i++){
                int nr=r+rm[i];
                int nc=c+cm[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && Math.max(Math.abs(grid[nr][nc]-grid[r][c]),d)<dis[nr][nc]){
                    dis[nr][nc]=Math.max(Math.abs(grid[nr][nc]-grid[r][c]),d);
                    pq.add(new path(nr,nc,Math.max(Math.abs(grid[nr][nc]-grid[r][c]),d)));
                }
            }
        }








      return 0;
    }
    public static void main(String[] args) {

    }
}
class path{
    int r;
    int c;
    int d;
    public path(int r, int c, int d){
        this.r=r;
        this.c=c;
        this.d=d;
    }
}
