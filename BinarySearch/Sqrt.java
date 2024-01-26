package CP.BinarySearch;

public class Sqrt {
    public static void main(String[] args) {
        double n=30;
        double left=1,right=n;
        while(right-left>0.00000001){
            double mid=(left+right)/2;
            if(mid*mid>=n){
                right=mid;
            }
            else
                left=mid;
        }
        System.out.println(left+" "+(float)right);
    }
}
