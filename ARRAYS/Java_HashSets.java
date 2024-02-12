package CP.ARRAYS;

import java.util.*;

public class Java_HashSets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        Set<String> set=new HashSet<>();
        int arr[]=new int[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            String str=pair_left[i]+pair_right[i];
            set.add(str);
            arr[i]=set.size();

        }
        for(int i:arr){
            System.out.print(i+" ");
        }


    }
}
