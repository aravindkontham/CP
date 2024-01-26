package CP.Recurrsion;

public class Basics {
    public static void print(int n){
        if(n==0) return;
        n=n-1;
        print(n);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n=4;
        print(n);

    }
}
