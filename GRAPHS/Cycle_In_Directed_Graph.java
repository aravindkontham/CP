package CP.GRAPHS;

import java.util.ArrayList;

public class Cycle_In_Directed_Graph {
    public static boolean dfs(ArrayList<ArrayList<Integer>>adj,int vis[], int path[], int id){
        vis[id]=1;
        path[id]=1;
        for(int node:adj.get(id)){
            if(vis[node]==0){
                if(dfs(adj,vis,path,node)) return true;
            }
            else if(path[node]==1){
                return true;
            }
        }
        path[id]=0;
        return false;
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[]=new int[V];
        int path[]=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0)
                if(dfs(adj,vis,path,i)) return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
