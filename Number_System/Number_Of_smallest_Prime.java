package CP.Number_System;

public class Number_Of_smallest_Prime {
    public static void main(String[] args) {
        int n=1000000;
        int arr[]=new int[n+1];
        for(int i=2;i<=n;i++){
            arr[i]=1;
        }

        for(int i=2;i*i<=n;i++){
            if(arr[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    if(arr[j]!=0){
                        arr[i]++;
                        arr[j]=0;
                    }
                }
            }
        }
        System.out.println(arr[3]);
    }
}
