package CP.ARRAYS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
//        Queries
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            String query=sc.next();
            int ind=sc.nextInt();
            if(query.equals("Insert")){
                int value=sc.nextInt();
                arr.add(ind,value);
            }
            else {
                arr.remove(ind);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

    }
}
