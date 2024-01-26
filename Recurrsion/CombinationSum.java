package CP.Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static void print_combo(int arr[], List<Integer> ls, int target, int ind,List<List<Integer>> ans){
        if(ind==arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(arr[ind]<=target){
            ls.add(arr[ind]);
            print_combo(arr,ls,target-arr[ind],ind,ans);
            ls.remove(ls.size()-1);
        }
        print_combo(arr,ls,target,ind+1,ans);

    }

    public static void main(String[] args) {
        int arr[]={3,2,7};
        int target=15;
        List<Integer> ls=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        print_combo(arr,ls,target,0,ans);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
