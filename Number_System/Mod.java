package CP.Number_System;

import java.util.Scanner;

public class Mod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        System.out.print("Enter the Mod value: ");
        int mod=sc.nextInt();

        System.out.println(mod+ " Mod of ("+a+"+"+b+") is:"+add_mod(a,b,mod));
        System.out.println(mod+ " Mod of ("+a+"-"+b+") is:"+sub_mod(a,b,mod));
        System.out.println(mod+ " Mod of ("+a+"*"+b+") is:"+Multi_mod(a,b,mod));
        System.out.println(mod+ " Mod of ("+a+"/"+b+") is:"+div_mod(a,b,mod));

    }
    public static int add_mod(int a, int b, int mod){
        int res=((a%mod)+(b%mod))%mod;
        return res;
    }
    public static int sub_mod(int a, int b, int mod){
        int res=((a%mod)-(b%mod)+mod)%mod;
        return res;
    }
    public static int Multi_mod(int a, int b, int mod){
        int res=((a%mod)*(b%mod))%mod;
        return res;
    }
    public static int div_mod(int a, int b, int mod){
        int res=((a%mod)*inv(b,mod))%mod;
        return res;
    }
    public static int inv(int b,int mod){
        int res=1;
        for(int i=0;i<mod-2;i++){
            res=res*b;
        }
        return res;
    }
}
