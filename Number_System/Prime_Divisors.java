package CP.Number_System;

import java.util.Scanner;

public class Prime_Divisors {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=2;i<n;i++){
            arr[i]=1;
        }
        for(int i=2;i<n;i++){
            if(arr[i]==1){
                for(int j=i*2;j<n;j+=i){
                    arr[j]=0;
                }
            }
        }

    }
}
