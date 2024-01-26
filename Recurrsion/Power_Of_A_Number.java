package CP.Recurrsion;

public class Power_Of_A_Number {
    static long pow(int x, int y){
        if(y==0) return 1;
        if(y%2==0)
        {
            long res=pow(x,y/2);
            return res*res;
        }
        else
            return pow(x,y-1)*x;
    }
    public static void main(String[] args) {
        System.out.println(pow(5,8));
    }
}
