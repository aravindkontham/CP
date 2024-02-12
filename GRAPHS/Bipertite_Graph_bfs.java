package CP.GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipertite_Graph_bfs {
    public static void main(String[] args) {

    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj){
            int color[]=new int[V];
            for(int i=0;i<V;i++) color[i]=-1;

            for(int i=0;i<V;i++){
                if(color[i]==-1){
                   return check(i,color,adj);
                }
            }

        // Code here
        return true;
    }
    public static boolean check(int start,int color[],ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q=new LinkedList<>();
        color[start]=0;
        q.add(start);
        while (!q.isEmpty()){
            int node=q.peek();
            q.remove();
            for(int i:adj.get(node)){
                if(color[i]==-1){
                    q.add(i);
                    color[i]=1-color[node];
                }
                else if(color[i]==color[node])
                    return false;
            }
        }
        return true;
    }
}
