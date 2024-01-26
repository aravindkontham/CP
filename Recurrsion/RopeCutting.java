package CP.Recurrsion;

public class RopeCutting {
    static int cutting(int n, int a, int b, int c){
        if(n==0) return 0;
        else if(n<0) return -1;
        int cut1=cutting(n-a,a,b,c);
        int cut2=cutting(n-b,a,b,c);
        int cut3=cutting(n-c,a,b,c);
        int cuts=Math.max(cut1,Math.max(cut2,cut3));
        if(cuts<0){
            return -1;
        }
        return cuts+1;
    }
    public static void main(String[] args) {
        System.out.println(cutting(15,3,2,7));
    }
}
