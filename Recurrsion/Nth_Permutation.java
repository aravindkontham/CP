package CP.Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class Nth_Permutation {
    public static String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact*i;
            nums.add(i);
        }
        nums.add(n);
        String ans=new String();
        k=k-1;
        while(true){
            ans+=nums.get(k/fact);
            nums.remove(k/fact);
            if(nums.size()==0) break;
            k=k%fact;
            fact=fact/nums.size();
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getPermutation(7,20));

    }
}
