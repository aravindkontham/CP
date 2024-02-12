package CP.GRAPHS;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstrasPriority {
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)

    {
        // Write your code here
        PriorityQueue<Node_dis> pq=new PriorityQueue<Node_dis>((x,y)->x.dis-y.dis);
        int dis[]=new int[V];
        for(int i=0;i<V;i++){
            dis[i]=(int)(1e9);
        }
        dis[S]=0;
        pq.add(new Node_dis(0,S));
        while(!pq.isEmpty()){
            int wt=pq.peek().dis;
            int nd=pq.peek().node;
            pq.remove();

            for(int i=0;i<adj.get(nd).size();i++){
                int nwt=adj.get(nd).get(i).get(1);
                int edge=adj.get(nd).get(i).get(0);
                if(wt+nwt<dis[edge]){
                    dis[edge]=wt+nwt;
                    pq.add(new Node_dis(dis[edge],edge));
                }
            }

        }
        return dis;


    }
    public static void main(String[] args) {

    }
}

class Node_dis{
    int dis;
    int node;
    public Node_dis(int dis, int node){
        this.node=node;
        this.dis=dis;
    }
}