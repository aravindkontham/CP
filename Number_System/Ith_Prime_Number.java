package CP.Number_System;

import java.util.ArrayList;
import java.util.List;

public class Ith_Prime_Number {
    public static int n=86028121;
    public static int limit=5*1000000;
    public static boolean arr[];

    public static void seive(){
        arr=new boolean[n+1];
        for(int i=2;i<=n;i++){
            arr[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        seive();
        List<Integer> dp=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(arr[i]==true)
                dp.add(i);
        }
        int k=5;
        System.out.println(dp.get(k-1));

    }
}
