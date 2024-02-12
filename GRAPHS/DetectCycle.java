package CP.GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycle {

    public static  boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]=new boolean[V+1];
        for(int i=1;i<=V;i++){
            if(vis[i]==false) {
                if (checkCycle(i, adj, vis))
                      return true;
            }
        }
        return false;

        // Code here
    }
    public static boolean checkCycle(int src,  ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        vis[src]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,0));
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.remove();

            for(int nodes:adj.get(node)){
                if(vis[nodes]==false){
                    vis[nodes]=true;
                    q.add(new Pair(nodes,parent));
                }
                else if(parent!=nodes){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {

    }
}
