package CP.Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class Print_All_Subsequences {
    public static void print(int ind,int arr[],List<Integer> ls){
        if(ind==arr.length){
            int sum=0;
            for(int i=0;i<ls.size();i++){
                sum+=ls.get(i);
                System.out.print(ls.get(i)+" ");
            }
            System.out.println(":"+sum);
            if(ls.size()==0)
                System.out.println("{}");
//            System.out.println();
            return;
        }
        ls.add(arr[ind]);
        print(ind+1,arr,ls);

        ls.remove(ls.size()-1);
        print(ind+1,arr,ls);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        List<Integer> ls=new ArrayList<>();
        print(0,arr,ls);
    }
}
