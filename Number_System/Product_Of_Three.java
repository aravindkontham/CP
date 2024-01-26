package CP.Number_System;

public class Product_Of_Three {
    public static int find(int n,int val){
        int res=1;
        for(int i=val+1;i*i<=n;i++){
            if(n%2==0){
                res=i;
                break;
            }
        }
        return  res;
        
    }
    public static void main(String[] args) {
        int n=64;
//        for(int i=2;i*i<=n;i++){
//            if(n%2==0){
//                a=i;
//                break;
//            }
//        }
//        n=n/a;
//        for(int i=a+1;i*i<=n;i++){
//            if(n%i==0){
//                b=i;
//                break;
//            }
//        }
//        c=n/b;
//        System.out.println(a+" "+b+" "+c);
        int a=find(n,1);
        int b=find(n/a,a);
        int c=n/b;
        if(a!=b && b!=c && c!=1 & b!=1 &a!=1){
            System.out.println(a+" "+b+" "+c);
        }
        else
            System.out.println("No such numbers:");
        
    }
}
