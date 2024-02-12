package CP.GRAPHS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Distinct_Islands {
    public static void dfs(int[][] grid,int[][] vis,int r,int c,ArrayList<String >arr,int ri, int ci){
        int n=grid.length;
        int m=grid[0].length;
        vis[r][c]=1;
        int del_r[]={0,-1,0,1};
        int del_c[]={-1,0,1,0};
        arr.add(toString(r-ri,c-ci));
        for(int i=0;i<4;i++){
            int nr=r+del_r[i];
            int nc=c+del_c[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && vis[nr][nc]==0){
                dfs(grid,vis,nr,nc,arr,ri,ci);
            }
        }
    }

    public static String toString(int r,int c){
        return Integer.toString(r)+""+Integer.toString(c);
    }
    public static  int countDistinctIslands(int[][] grid) {
        // Your Code here
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        Set<ArrayList<String>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]!=1){
                    ArrayList<String> arr=new ArrayList<>();
                    dfs(grid,vis,i,j,arr,i,j);
                    st.add(arr);
                }
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
        int grid[][] = {{1, 1, 0, 1, 1},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1},
                        {1, 1, 0, 1, 1}};
        System.out.println(countDistinctIslands(grid));

    }
}
//class nPair{
//    int first;
//    int second;
//    public nPair(int first, int second){
//        this.first=first;
//        this.second=second;
//    }
//}