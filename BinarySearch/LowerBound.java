package CP.BinarySearch;

import java.util.Scanner;

public class LowerBound {
    public static int LB(int arr[],int num){
        int n=arr.length;
        int ans=n;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=num){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
    public static int UB(int arr[],int num){
        int n=arr.length;
        int ans=n;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>num){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        System.out.println("LB:"+LB(arr,num));
        System.out.println("UB:"+UB(arr,num));
    }
}
