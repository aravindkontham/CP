package CP.Recurrsion;

public class BinaryExponentiation {
    public static int fun(int a, int b,int res){
        if(b==0) return res;
        if((b&1)==1){
            res=res*a;
        }
        return fun(a*a,b>>1,res);
    }
    public static void main(String[] args) {
        int a=3;
        int b=6;
        int res=1;
        System.out.println(fun(a,b,res));

    }
}
