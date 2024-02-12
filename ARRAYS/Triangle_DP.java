package CP.ARRAYS;

import java.util.List;

public class Triangle_DP {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int h=triangle.size();
        int dp[][]=new int[h+1][h+1];
//        for rows
        for(int r=h-1;r>=0;r--){
//            for columns
            for(int c=0;c<=r;c++){
                dp[r][c]=triangle.get(r).get(c)+Math.min(dp[r+1][c],dp[r+1][c+1]);
            }
        }
        return dp[0][0];

    }
    public static void main(String[] args) {

    }
}
