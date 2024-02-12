package CP.GRAPHS;

import java.util.ArrayList;

public class Bipertite_DFS {
    public static boolean dfs(int vis[],ArrayList<ArrayList<Integer>> adj,int id,int color){
        vis[id]=color;

        for(int node:adj.get(id)){
            if(vis[node]==-1){
                if(dfs(vis,adj,node,1-color)==false) return false;

            }
            else if(vis[color]==color)
                return false;
        }
        return true;


    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj){
        int vis[]=new int[V];
        for(int i=0;i<V;i++) vis[i]=-1;
        for(int i=0;i<V;i++){
            if(vis[i]==-1){
                if(dfs(vis,adj,i,0)==false) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
