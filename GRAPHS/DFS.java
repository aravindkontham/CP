package CP.GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {
    static void DFS(ArrayList<ArrayList<Integer>> adj,int src, int vis[],ArrayList<Integer> lst){
        vis[src]=1;
        lst.add(src);

        for(int i:adj.get(src)){
            if(vis[i]!=1){
                DFS(adj,i,vis,lst);
            }
        }

        return;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = 5;
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }
//        edge 1--2
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);

        adj.get(2).add(1);

        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(5);

        adj.get(4).add(1);
        adj.get(4).add(5);
        adj.get(4).add(3);

        adj.get(5).add(4);
        adj.get(5).add(3);
        int flag[]=new int[n+1];
        ArrayList<Integer> arr=new ArrayList<>();

        DFS(adj,1,flag,arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
