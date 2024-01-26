package CP.Number_System;

import java.util.Scanner;

public class Sum_Of_Divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int sum[]=new int[n];
        int count[]=new int[n];
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j+=i){
                arr[j]+=i;

//                number of divisors
                count[j]++;

//                sum of odd divisors - sum of even divisors
                if(i%2==1){
                    sum[j]+=i;
                }
                else
                    sum[j]-=i;

            }
        }
        for(int i=0;i<n;i++){
            System.out.println(i+"-> "+count[i]);
        }
    }
}
