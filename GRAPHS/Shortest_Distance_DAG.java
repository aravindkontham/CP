package CP.GRAPHS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Shortest_Distance_DAG {
    public static int[] shortestPath(int N,int M, int[][] edges) {
        List<List<Weight>> adj=new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<Weight>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new Weight(edges[i][1],edges[i][2]));
        }
        Stack<Integer> st=new Stack<>();
        int vis[]=new int[N];
        for(int i=0;i<N;i++){
            if(vis[i]==0)
                dfs(vis,st,adj,i);
        }
        int dis[]=new int[N];
        for(int i=0;i<N;i++){
            dis[i]=(int)(1e9);
        }
       dis[0]=0;
        while(!st.isEmpty()){
            int node=st.peek();
            for(int i=0;i<adj.get(node).size();i++){
                int v=adj.get(node).get(i).n;
                int wt=adj.get(node).get(i).w;
                if(dis[node]+wt<dis[v])
                    dis[v]=wt+dis[node];
            }
            st.pop();
        }

        for(int i=0;i<N;i++){
            if(dis[i]==(int)(1e9))
                dis[i]=-1;
         }
        return dis;
    }
    public static void dfs(int vis[],Stack<Integer>st, List<List<Weight>> adj,int id){
        vis[id]=1;
        for(int i=0;i<adj.get(id).size();i++){
            int v=adj.get(id).get(i).n;
            if(vis[v]==0)
                dfs(vis,st,adj,v);
        }
        st.push(id);
        return;

    }
    public static void main(String[] args) {

    }
}
class  Weight{
    int n;
    int w;
    public Weight(int n,int w){
        this.n=n;
        this.w=w;
    }
}

