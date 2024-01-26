package CP;

import java.util.Scanner;

public class A_Power_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base number:");
        int a= sc.nextInt();
        System.out.print("Enter the power number:");
        int b= sc.nextInt();
        int base=a;
        int pow=b;
        int res=1;
        while(b!=0){
            if((b&1)==1){
                res=res*a;
            }
            a=a*a;
            b=b>>1;
        }
        res=(res%100000000+9);
        System.out.println(base+" to the power of "+pow+" is:"+res);
        System.out.println(1e18);
    }
}
