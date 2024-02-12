package CP.GRAPHS;

import java.util.ArrayList;
import java.util.Stack;

public class Topological_Sort {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        Stack<Integer> st=new Stack<>();
        int vis[]=new int[V];
        for(int i=0;i<adj.size();i++){
            if(vis[i]==0){
                dfs(adj,vis,0,st);
            }
        }
        int i=0;
       while(!st.isEmpty()){
           vis[i]=st.pop();
           i++;
       }
       return vis;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int vis[],int id,Stack<Integer> st){
        vis[id]=1;
        for(int node:adj.get(id)){
            if(vis[node]!=1){
                dfs(adj,vis,node,st);
            }
        }
        st.push(id);
        return;
    }
    public static void main(String[] args) {

    }

}
