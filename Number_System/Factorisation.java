package CP.Number_System;

public class Factorisation {
    public static void Brute_Force(int n){
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
    }

    public static void Seive(int n){
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=i;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==i){
                for(int j=i*i;j<=n;j+=i){
                   if(arr[j]==j) arr[j]=i;
                }
            }
        }
        while (n!=1){
            System.out.print(arr[n]+" ");
            n=n/arr[n];
        }
    }

    public static void main(String[] args) {
        Brute_Force(100);
        System.out.println();
        Seive(100);

    }
}
