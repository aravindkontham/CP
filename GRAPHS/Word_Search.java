package CP.GRAPHS;

public class Word_Search {
    public static  boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        int vis[][]=new int [n][m];
        boolean ans=false;
        char arr[]=word.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==arr[0] && vis[i][j]==0){
                    vis[i][j]=1;
                    ans=ans || dfs(board,vis,arr,1,i,j);
                }
            }
        }
        return ans;

    }
    public static boolean dfs(char[][] board,int[][] vis,char [] arr,int id,int r,int c){
        if(id==arr.length) return true;

        boolean flag=false;
        int n=board.length;
        int m=board[0].length;

        int[] rm = {-1, 0, 1, 0};
        int[] cm = {0, 1, 0, -1};

        for(int i=0;i<4;i++){
            int nr=r+rm[i];
            int nc=c+cm[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && board[nr][nc]==arr[id] && vis[nr][nc]==0){
                vis[nr][nc]=1;
                flag=flag || dfs(board,vis,arr,id+1,nr,nc);
            }
        }
        vis[r][c]=0;
        return flag;
    }



    public static void main(String[] args) {
        char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board,word));

    }
}
