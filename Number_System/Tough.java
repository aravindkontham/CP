package CP.Number_System;

import java.util.ArrayList;
import java.util.List;

public class Tough {
    public static int tough(int n){
        int N=1000000;
        int seive[]=new int[N+1];
        for (int i=2;i<=N;i++){
            seive[i]=1;
        }
        for(int i=2;i*i<=N;i++){
            if(seive[i]==1){
                for(int j=i*i;j<=N;j+=i){
                    seive[j]=0;
                }
            }
        }
        List<Integer> arr=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(seive[i]==1){
                arr.add(i);
             }
        }
//        if(arr.size()==0)
//            return 1;
        int res=n;
        int div=1;
        for(int i=0;i<arr.size();i++){
            int p=arr.get(i);
            System.out.print(p+" ");
            div=div*p;
            res=res*(p-1);
        }
        System.out.print(res+" ");
        System.out.println(div+" ");
        return res/div;

    }

    public static void main(String[] args) {
        int n=10;
        for(int i=5;i<=n;i++){
            tough(i);
            System.out.println();
        }
    }
}
