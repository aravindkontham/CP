package CP;

public class XOR_OF_RANGE {
    public static void main(String[] args) {
        int l=3;
        int r=6;
        int num1=1;
        for(int i=2;i<l;i++){
            num1=num1^i;
        }
        int num2=1;
        for(int i=2;i<=r;i++){
            num2=num2^i;
        }
        int res=num1^num2;
        System.out.println(res);
    }
}
