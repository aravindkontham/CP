package CP.GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AleinDict {
    public static String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<K;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<dict.length-1;i++){
            String s1=dict[i];
            String s2=dict[i+1];
            int min=Math.min(s1.length(),s2.length());
            for(int c=0;c<min;c++){
                if(s1.charAt(c)==s2.charAt(c))
                    continue;
                else
                {
                    adj.get(s1.charAt(c)-'a').add(s2.charAt(c)-'a');
                    break;
                }
            }
        }
        int deg[]=new int[K];
        for(int i=0;i<K;i++){
            for(int it: adj.get(i))
                deg[it]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<K;i++){
            if(deg[i]==0)
                q.add(i);
        }
        List<String> top=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            char ch=(char)(node+'a');
            String st=String.valueOf(ch);
            top.add(st);
            for(int it:adj.get(node)){
                deg[it]--;
                if(deg[it]==0){
                    q.add(it);
                }
            }
        }
        String ans=new String();
        for(int i=0;i<top.size();i++){
            ans+=top.get(i);
        }
       return ans;

    }
    public static void main(String[] args) {
        char c='a';
        int a=1;
        char ch=(char)(a+c);
        String st=String.valueOf(ch);
        System.out.println(st);
        System.out.println((char)(a+c));

    }
}
