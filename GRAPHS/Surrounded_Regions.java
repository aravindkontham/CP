package CP.GRAPHS;

public class Surrounded_Regions {

    public static void solve(char[][] board) {

        int n=board.length;
        int m=board[0].length;
        int match[][]=new int[n][m];
//        for 1st row and last row
        for(int j=0;j<m;j++){
            if(board[0][j]=='O' && match[0][j]==0)
                dfs(board,match,0,j);
        }
        for(int j=0;j<m;j++){
            if(board[n-1][j]=='O' && match[n-1][j]==0)
                dfs(board,match,n-1,j);
        }

//        for 1st column and last column;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O' && match[i][0]==0)
                dfs(board,match,i,0);
        }
        for(int i=0;i<m;i++){
            if(board[i][m-1]=='O' && match[i][m-1]==0)
                dfs(board,match,i,m-1);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(match[i][j]==0)
                    board[i][j]='X';
                else
                    board[i][j]='O';
            }
        }


    }
    public static void dfs(char[][] board,int match[][],int r,int c){
        int n=board.length;
        int m=board[0].length;
        match[r][c]=1;
        int del_r[]={0,-1,0,1};
        int del_c[]={-1,0,1,0};

        for(int i=0;i<4;i++){
            int nr=del_r[i]+r;
            int nc=del_c[i]+c;

            if(nr>=0 && nr<n && nc>=0 && nc<m && board[nr][nc]=='O' && match[nr][nc]==0){
                dfs(board,match,nr,nc);
            }
        }
        return;
    }





    public static void main(String[] args) {



    }
}
