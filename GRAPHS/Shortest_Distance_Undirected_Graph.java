package CP.GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Shortest_Distance_Undirected_Graph {
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {

        // Code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
//         [[0,1],[0,3],[3,4],[4 ,5] ,[5, 6],
//          [1,2],[2,6],[6,7],[7,8],[6,8]]
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int dis[]=new int[n];
        for(int i=0;i<n;i++){
            dis[i]=(int)(1e9);
        }
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        dis[src]=0;
        while (!q.isEmpty()){
            int node=q.peek();
            q.remove();
            for(int it:adj.get(node)){
                q.add(it);
                if(dis[node]+1<dis[it])
                    dis[it]=dis[node]+1;
            }
        }
        for(int i=0;i<n;i++){
            if(dis[i]==(int)(1e9)) dis[i]=-1;
        }
        return dis;
    }
    public static void main(String[] args) {

    }
}
