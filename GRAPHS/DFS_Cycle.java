package CP.GRAPHS;

import java.util.ArrayList;

public class DFS_Cycle {
    public static void main(String[] args) {

    }

    public boolean isCycle(int n, ArrayList<ArrayList<Integer>> adj) {
        boolean  vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                if(dfs(i,-1,adj,vis)) return true;
            }
        }
        return false;
    }

    public boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        vis[node]=true;
        for(int i:adj.get(node)){
            if(vis[i]==false){
                if (dfs(i,node,adj,vis))
                    return true;
            }
            else if(i!=parent)
                return true;
        }
        return false;

    }
}
