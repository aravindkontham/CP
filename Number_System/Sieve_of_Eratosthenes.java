package CP.Number_System;

import java.util.Scanner;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=2;i<=n;i++){
            arr[i]=1;
        }
//        cancelling the multiples of every number
        for(int i=2;i*i<=n;i++){
            if(arr[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=0;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==1)
                System.out.print(i+" ");
        }

    }
}
