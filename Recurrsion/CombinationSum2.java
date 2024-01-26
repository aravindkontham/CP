package CP.Recurrsion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum2 {
    static void print_combo(int arr[], List<Integer> ls, int target, int ind,Set<List<Integer>> ans){
        if(ind==arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(arr[ind]<=target){
            ls.add(arr[ind]);
            print_combo(arr,ls,target-arr[ind],ind+1,ans);
            ls.remove(ls.size()-1);
        }
        print_combo(arr,ls,target,ind+1,ans);

    }

    public static void main(String[] args) {
        int arr[]={1,1,1,2,2};
        int target=4;
        List<Integer> ls=new ArrayList<>();
        Set<List<Integer>> ans=new HashSet<>();
        print_combo(arr,ls,target,0,ans);
//        for(int i=0;i<ans.size();i++){
//            System.out.println(ans.get(i));
//        }
        System.out.println(ans);
    }
}
