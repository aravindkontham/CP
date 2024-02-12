package CP.GRAPHS;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryMaize {
    int shortestPath(int[][] grid, int[] source, int[] destination) {

        // Your code here
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int s1=source[0];
        int s2=source[1];
        int d1=destination[0];
        int d2=destination[1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==s1 && j==s2)
                    continue;
                vis[i][j]=(int)(1e9);
            }
        }
        Queue<maize> q=new LinkedList<>();
        q.add(new maize(s1,s2,0));
        int[] rm = {-1, 0, 1, 0};
        int[] cm = {0, 1, 0, -1};
        while (!q.isEmpty()){
            int r=q.peek().r;
            int c=q.peek().c;
            int d=q.peek().d;
            if(r==d1 && c==d2)
                return d;
            q.remove();
            for(int i=0;i<4;i++){
                int nr=r+rm[i];
                int nc=c+cm[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1){
                    if(d+1<vis[nr][nc]){
                        vis[nr][nc]=d+1;
                        q.add(new maize(nr,nc,d+1));
                    }

                }
            }

        }
        return 0;

    }
    public static void main(String[] args) {

    }
}
class maize{
    int r;
    int c;
    int d;
    public maize(int r, int c, int d){
        this.r=r;
        this.c=c;
        this.d=d;
    }
}
