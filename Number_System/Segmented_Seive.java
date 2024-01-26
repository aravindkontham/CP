package CP.Number_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Segmented_Seive {
    public static int arr[];
    public static void seive(){
        int n=1000000;
        arr=new int[n+1];
        for(int i=2;i<n;i++){
            arr[i]=1;
        }
//        cancelling the multiples of every number
        for(int i=2;i*i<n;i++){
            if(arr[i]==1){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=0;
                }
            }
        }
//        List<Integer>arr=new ArrayList<>();
//        int seive[]=new int[r+1];
//        for(int i=2;i<r;i++){
//            seive[i]=1;
//        }
//        for(int i=2;i*i<r;i++){
//            if(seive[i]==1){
//                for(int j=i*i;j<r;j+=i){
//                    seive[i]=0;
//                }
//            }
//        }
//        for(int i=2;i*i<r;i++){
//            if(seive[i]==1){
//                arr.add(i);
//            }
//        }
//        int res[]=new int[r-l+1];
//        for(int i=0;i<res.length;i++){
//            res[i]=l;
//            l++;
//        }
//        for(int i=0;i<arr.size();i++){
//            int num=arr.get(i);
//            System.out.println(num);
//            for(int j=0;j<res.length;j++){
//                if(res[j]%i==0){
//                    res[j]=0;
//                }
//            }
//        }
//        for(int i=0;i<res.length;i++){
//            if(res[i]!=0)
//                System.out.print(res[i]+" ");
//
//        }
//
    }
    public static List<Integer> getPrimes(int n){
        List<Integer> primes=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(arr[i]==1) primes.add(i);
        }

        return primes;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        seive();
        List<Integer> res=getPrimes((int)Math.sqrt(r));
        int dummy[]=new int[r-l+1];
        for(int i=0;i<dummy.length;i++){
            dummy[i]=l;
            l++;
        }

        for(int i=0;i<res.size();i++){
            int num=res.get(i);
            System.out.print(num+" ");
            for(int j=0;j<dummy.length;j++){
                if(dummy[i]!=num){
                    if(dummy[j]%num==0)
                        dummy[j]=0;
                }

            }
        }
        System.out.println();
        for(int i=0;i<dummy.length;i++){
            if(dummy[i]!=0) System.out.print(dummy[i]+" ");
        }

    }
}
