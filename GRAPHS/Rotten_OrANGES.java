package CP.GRAPHS;

import java.util.LinkedList;
import java.util.Queue;

public class Rotten_OrANGES {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int O_fresh=0;
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j,0));
                    vis[i][j]=2;
                }
                else if(grid[i][j]==1){
                    O_fresh++;
                }
            }
        }
        int cnt=0;
        int t=0;
        int row_ind[]={0,-1,0,1};
        int col_ind[]={-1,0,1,0};

        while(!q.isEmpty()) {
            int r=q.peek().r;
            int c=q.peek().c;
            int ty=q.peek().ty;
            q.poll();

            for(int i=0;i<4;i++){
                int nr=r+row_ind[i];
                int nc=c+col_ind[i];
                t=Math.max(t,ty);

                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && vis[nr][nc]==0){
                    q.add(new pair(nr,nc,ty+1));
                    vis[nr][nc]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=O_fresh) return -1;

        return t;

    }

    public static void main(String[] args) {

    }
}
class pair{
    int r;
    int c;
    int ty;
    public pair(int r, int c, int ty){
        this.r=r;
        this.c=c;
        this.ty=ty;
    }
}
