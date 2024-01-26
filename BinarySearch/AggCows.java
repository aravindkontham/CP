package CP.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class AggCows {
    public static int findCows(int arr[],int mid,int cows){
        int c=1;
        int prv=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-prv>=mid){
                c++;
                prv=arr[i];
            }
            if(c==cows) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cows=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int ans=0;
        int low=arr[0],high=arr[n-1]-arr[0];
        while(low<=high){
            int mid=(low+high)>>2;
            if(findCows(arr,mid,cows)==1){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        System.out.println(ans);

        }
    }

