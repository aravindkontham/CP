package CP.Number_System;

import java.util.Scanner;

public class CLT {
    public static int findCLT(int n,int primes[],int rm[]){
        int M=1,ans=0;
        for(int i=0;i<n;i++){
            M=M*primes[i];
        }
        System.out.println("M: "+M);
        for(int i=0;i<n;i++){
            int m=M/primes[i];
            int x=div_mod(rm[i],m,primes[i]);
            System.out.println(m+" "+x);
            ans+=x*m;
        }
        return ans/M;
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter the Primes:");
        int primes[]=new int[n];
        for(int i=0;i<n;i++){
             primes[i]=sc.nextInt();
        }
        System.out.println("Enter the Remainders:");
        int rm[]=new int[n];
        for(int i=0;i<n;i++){
            rm[i]=sc.nextInt();
        }
        System.out.println(findCLT(n,primes,rm));
    }
}
