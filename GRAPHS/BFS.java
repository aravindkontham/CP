package CP.GRAPHS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj,int src,int n){
        int flag[]=new int[n+1];
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        flag[src]=1;
        q.add(src);
        while(!q.isEmpty()){
            int node=q.peek();
            q.poll();
            arr.add(node);
            for(int i=0;i<adj.get(node).size();i++){
                if(flag[adj.get(node).get(i)]==0){
                    flag[adj.get(node).get(i)]=1;
                    q.add(adj.get(node).get(i));
                }
            }
        }
        return arr;


    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=5;
        for(int i=0;i<=n;i++){
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

//        for(int i=0;i<adj.size();i++){
//            for (int j=0;j<adj.get(i).size();j++){
//                System.out.print(adj.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
        System.out.println(bfs(adj,3,5));
    }
}
