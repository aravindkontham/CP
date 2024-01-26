package CP.Recurrsion;

public class Josephus_Solution {
    static int position(int n, int k){
        if(n==1) return 0;
        return (position(n-1,k)+k)%7;
    }
    public static void main(String[] args) {
        System.out.println(position(10,3));

    }
}
