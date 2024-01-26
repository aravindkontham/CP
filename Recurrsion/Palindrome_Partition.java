package CP.Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partition {
    static void print(String s, int ind,List<String> arr, List<List<String>>ls){
        if(ind==s.length()){
            ls.add(new ArrayList<>(arr));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                arr.add(s.substring(ind,i+1));
                print(s,i+1,arr,ls);
                arr.remove(arr.size()-1);
            }
        }
    }
    static boolean isPalindrome(String s, int l, int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            else
            {
                l++;
                r--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="aabb";
        List<List<String>> ls=new ArrayList<>();
        List<String> arr=new ArrayList<>();
        print(s,0,arr,ls);
        System.out.println(ls);
    }
}
