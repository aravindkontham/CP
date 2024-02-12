package CP.GRAPHS;

import java.util.LinkedList;
import java.util.Queue;
class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
public class Number_OfIslands {
    public  static void bfs(int r, int c, char[][] grid, int vis[][]){
        vis[r][c]=1;
        Queue<Pair> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        q.add(new Pair(r,c));
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();

            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    int nr=row+i;
                    int nc=col+j;

                    if(nr>0 && nr<n && nc>0 && nc<m && grid[nr][nc]=='1' && vis[nr][nc]==0){
                        vis[nr][nc]=1;
                        q.add(new Pair(nr,nc));
                    }
                }
            }

        }
    }
    public static  int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int arr[][]=new int[n][m];
        int count=0;
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(arr[r][c]==0 && grid[r][c]=='1'){
                    count++;
                    bfs(r,c,grid,arr);
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {

    }
}


//class Solution {
//    public  static void bfs(int r, int c, char[][] grid, int vis[][]){
//        vis[r][c]=1;
//        Queue<Pair> q=new LinkedList<>();
//        int n=grid.length;
//        int m=grid[0].length;
//        q.add(new Pair(r,c));
//        int[] rm = {-1, 0, 1, 0};
//        int[] cm = {0, 1, 0, -1};
//
//        while(!q.isEmpty()){
//            int row=q.peek().first;
//            int col=q.peek().second;
//            q.remove();
//
//
//            for(int j=0;j<4;j++){
//                int nr=row+rm[j];
//                int nc=col+cm[j];
//
//                if(nr>=0 && nr<n && nc>=0 && nc<m  && grid[nr][nc]=='1' && vis[nr][nc]==0){
//                    vis[nr][nc]=1;
//                    q.add(new Pair(nr,nc));
//                }
//            }
//
//        }
//    }
//    public int numIslands(char[][] grid) {
//        int n=grid.length;
//        int m=grid[0].length;
//        int arr[][]=new int[n][m];
//        int count=0;
//        for(int r=0;r<n;r++){
//            for(int c=0;c<m;c++){
//                if(arr[r][c]==0 && grid[r][c]=='1'){
//                    bfs(r,c,grid,arr);
//                    count++;
//                }
//            }
//        }
//        return count;
//
//    }
//}
//
//class Pair{
//    int first;
//    int second;
//    public Pair(int first, int second){
//        this.first=first;
//        this.second=second;
//    }
//}