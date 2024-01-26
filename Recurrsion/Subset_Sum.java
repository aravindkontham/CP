package CP.Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class Subset_Sum {
    static void subsets(int ind, int arr[],List<Integer> ls, int sum,int s){
         if(ind==arr.length){
             if(s==sum){
                 for(int i=0;i<ls.size();i++){
                     System.out.print(ls.get(i)+" ");
                 }
                 System.out.println();
             }
             return;
         }
//         pick
         ls.add(arr[ind]);
         s+=arr[ind];
         subsets(ind+1,arr,ls,sum,s);

//         not pick
        ls.remove(ls.size()-1);
        s-=arr[ind];
        subsets(ind+1,arr,ls,sum,s);
    }



    static boolean subsets_single(int ind, int arr[],List<Integer> ls, int sum,int s){
        if(ind==arr.length){
            if(s==sum){
                for(int i=0;i<ls.size();i++){
                    System.out.print(ls.get(i)+" ");
                }
                return true;
            }
            else  return false;
        }
//         pick
        ls.add(arr[ind]);
        s+=arr[ind];
        if(subsets_single(ind+1,arr,ls,sum,s)==true) return true;

//         not pick
        ls.remove(ls.size()-1);
        s-=arr[ind];
        if(subsets_single(ind+1,arr,ls,sum,s)==true) return true;
        return false;
    }

//    Count the subsets
static int count(int ind, int arr[], int sum,int s){
        if(s>sum) return 0;
        if(ind==arr.length){
             if(s==sum){
                return 1;
                  }
             else
                return 0;
    }
//         pick
    s+=arr[ind];
   int left=count(ind+1,arr,sum,s);

//         not pick
    s-=arr[ind];
    int right =count(ind+1,arr,sum,s);
    return left+right;
}

    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,4};
        List<Integer> ls=new ArrayList<>();
        int sum=4;
        subsets(0,arr,ls,sum,0);
        System.out.println();
        System.out.println(subsets_single(0,arr,ls,sum,0));
        System.out.println();
        System.out.println(count(0,arr,sum,0));
    }
}
