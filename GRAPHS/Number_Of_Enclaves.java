package CP.GRAPHS;

import java.util.LinkedList;
import java.util.Queue;

public class Number_Of_Enclaves {
    public static int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        Queue<IND> q=new LinkedList<>();
//        checking the rows
        for(int j=0;j<m;j++){
//            1st row
            if(grid[0][j]==1){
                q.add(new IND(0,j));
                vis[0][j]=1;
            }
//            last row
            if(grid[n-1][j]==1){
                q.add(new IND(n-1,j));
                vis[n-1][j]=1;
            }
        }

//        checking the columns
        for(int i=0;i<n;i++){
//            1st column
            if(grid[i][0]==1){
                q.add(new IND(i,0));
                vis[i][0]=1;
            }
//            last column
            if (grid[i][m-1]==1){
                q.add(new IND(i,m-1));
                vis[i][m-1]=1;
            }
        }
        int del_r[]={0,-1,0,1};
        int del_c[]={-1,0,1,0};
        while(!q.isEmpty()){
            int r=q.peek().r;
            int c=q.peek().c;
            q.remove();
            for(int i=0;i<4;i++){
                int nr=del_r[i]+r;
                int nc=del_c[i]+c;
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && vis[nr][nc]==0){
                    q.add(new IND(nr,nc));
                    vis[nr][nc]=1;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0)
                    count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        int grid[][]={{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(numEnclaves(grid));

    }
}
class IND{
    int r;
    int c;
    public IND(int r, int c){
        this.r=r;
        this.c=c;
    }
}
