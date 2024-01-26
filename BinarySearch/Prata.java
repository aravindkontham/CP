package CP.BinarySearch;

import java.util.Scanner;

public class Prata {
    public static int find_pratas(int arr[],int n,int para,int mid){
        int time=0;
        int pratas=0;
        for(int i=0;i<n;i++){
            time=arr[i];
            int j=2;
            while(time<=mid){
                pratas++;
                time=time+arr[i]*j;
                j++;
            }
            System.out.println(pratas);
            if(pratas>=para) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int para=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int lb=0,ub=100000000;
        int ans=0;
        while(lb<=ub){
            int mid=(lb+ub)/2;
            if(find_pratas(arr,n,para,mid)==1){
                ans=mid;
                ub=mid-1;
            }
            else
                lb=mid+1;
        }
        System.out.println(ans);
    }
}
