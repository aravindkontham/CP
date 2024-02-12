package CP.ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class SlidingSubArray {
    public static int subarray(int target,int arr[]){
        List<Integer> store=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target)
                return 1;
        }

        for(int i=2;i<arr.length;i++){
            sum(arr,i,target,store,Integer.MAX_VALUE);
        }
        int min=store.get(0);
        if(min!=Integer.MAX_VALUE)
            return min;
        return 0;

    }
    public static void sum(int arr[], int k, int target, List<Integer> lt,int min){
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum>=target){
            if(k<min)
            {
                min=k;
                lt.remove(lt.size()-1);
                lt.add(k);
            }
            return;
        }
        int pre=arr[0];
        int id=1;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[k]-pre;
            pre=arr[id++];
            if(sum>=target){
                if(k<min)
                {
                    min=k;
                    lt.remove(lt.size()-1);
                    lt.add(k);
                }
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(subarray(4,arr));

    }

}
