package CP.GRAPHS;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Min_Spanning_Tree {
    static List<store> spanningTree(int V, int E, int edges[][]){
        // Code Here.
        int n=edges.length;
        List<List<edge>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<edge>());
        }
        for(int i=0;i<n;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int d=edges[i][2];
            adj.get(u).add(new edge(v,d));
            adj.get(v).add(new edge(u,d));
        }
        PriorityQueue<min> pq=new PriorityQueue<min>((x,y)->x.wt-y.wt);
        int sum=0;
        int vis[]=new int[V];
        List<store> add=new ArrayList<>();
        pq.add(new min(0,0,-1));
        while(!pq.isEmpty()){
            int wt=pq.peek().wt;
            int nd=pq.peek().n;
            int p=pq.peek().p;
            pq.remove();
            if(p!=-1 && vis[nd]==0){
                add.add(new store(nd,p));
            }
            if( vis[nd]==1) continue;
            vis[nd]=1;
            sum+=wt;
            for(int i=0;i<adj.get(nd).size();i++){
                int n_node=adj.get(nd).get(i).n;
                int d=adj.get(nd).get(i).d;
                if(vis[n_node]==0) pq.add(new min(d,n_node,nd));
            }

        }
        for(store st:add){
            System.out.println(st);
        }
        return add;



    }
    public static void main(String[] args) {
//        3 3
//        0 1 5
//        1 2 3
//        0 2 1
        int arr[][]={{0, 1, 5},{1, 2, 3},{0,2,1}};
        System.out.println(spanningTree(3,3,arr));

    }
}
class edge{
    int n;
    int d;
    public edge(int n, int d){
        this.n=n;
        this.d=d;
    }
}
class min{
    int wt;
    int n;
    int p;
    public min(int wt, int n, int p){
        this.wt=wt;
        this.n=n;
        this.p=p;
    }
}
class store{
    int n;
    int p;
    public store(int n, int p){
        this.n=n;
        this.p=p;
    }

}