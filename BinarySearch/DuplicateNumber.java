package CP.BinarySearch;

import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0,high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]<=mid)
                    count++;
            }
            if(count<=mid)
                low=mid+1;
            else
                high=mid;

        }
        System.out.println(low);
    }
}
