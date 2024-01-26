package CP.BinarySearch;

import java.util.Scanner;

public class Stuples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int aa=0;aa<n;aa++){
            for(int bb=0;bb<n;bb++){
                for(int cc=0;cc<n;cc++){
                    for(int dd=0;dd<n;dd++){
                        for(int ee=0;ee<n;ee++){
                            for(int ff=0;ff<n;ff++){
                                int a=arr[aa];
                                int b=arr[bb];
                                int c=arr[cc];
                                int d=arr[dd];
                                int e=arr[ee];
                                int f=arr[ff];
                                if(d!=0 && (a*b)+c==(f+e)*d)
                                    count++;

                            }
                        }
                    }
                }
            }}
        System.out.println(count);
    }
}
