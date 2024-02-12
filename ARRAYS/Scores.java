package CP.ARRAYS;

import com.sun.source.tree.LiteralTree;

import java.util.ArrayList;
import java.util.List;

public class Scores {
    public static void main(String[] args) {
        int n=10;
        List<String> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i+"");
        }
        int score=-0;
        while(arr.size()!=1){
            int size=arr.size();

            List<String> lt=new ArrayList<>();
            for(int i=0;i<arr.size();i=i+2){
                System.out.println(arr.get(i));
                score=score+Integer.parseInt(arr.get(i));
                lt.add(arr.get(i));

            }
            for(int i=0;i<lt.size();i++){
                arr.remove(lt.get(i));
            }
        }
        System.out.println(score);
    }
}
