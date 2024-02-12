package CP.GRAPHS;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Number_Of_ways {
    public int countPaths(int n, int[][] roads) {
        int ways[]=new int[n];
        ways[0]=1;
        int dis[]=new int[n];
        for(int i=0;i<n;i++){
            dis[i]=(int)(1e9);
        }
        dis[0]=0;
//        Adjacency List
        List<List<ways>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<ways>());
        }
        for(int i=0;i<roads.length;i++){
            adj.get(roads[i][0]).add(new ways(roads[i][1],roads[i][2]));
            adj.get(roads[i][1]).add(new ways(roads[i][0],roads[i][2]));
        }
        PriorityQueue<ways> pq=new PriorityQueue<ways>((x,y)->x.d-y.d);
        pq.add(new ways(0,0));
        int mod=(int)(1e9+7);
        while (!pq.isEmpty()){
            int node=pq.peek().node;
            int d=pq.peek().d;
            pq.remove();
            for(int i=0;i<adj.get(node).size();i++){
                int n_node=adj.get(node).get(i).node;
                int n_d=adj.get(node).get(i).d;
                if(d+n_d<=dis[n_d]){
                    dis[n_d]=d+n_d;
                    ways[n_node]++;
                    pq.add(new ways(n_node,d+n_d));
                }
            }
        }
        return ways[n-1];

    }
    public static void main(String[] args) {

    }
}
class ways{
    int node;
    int d;
    public ways(int node, int d){
        this.node=node;
        this.d=d;
    }
}
