package CP.ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class Sequential_Digits {
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> arr = new ArrayList<>();
        int nl = String.valueOf(low).length();
        int nh = String.valueOf(high).length();
        String digits = new String("123456789");
        for(int i=nl;i<=nh;i++){
            for(int j=0;j<10-i;j++){
                int num=Integer.parseInt(digits.substring(j,j+i));
                if(num>=low && num<=high)
                    arr.add(num);
            }
        }

     return arr;

    }


    public static void main (String[]args){
        System.out.println(sequentialDigits(1000, 13000));
        String word="abd";
        char arr[]=word.toCharArray();


        }
}
