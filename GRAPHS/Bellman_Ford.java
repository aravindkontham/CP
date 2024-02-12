package CP.GRAPHS;

import java.util.ArrayList;

public class Bellman_Ford {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        // Write your code here
        int dis[]=new int[V];
        for(int i=0;i<V;i++){
            dis[i]=(int)(1e9);
        }
        dis[S]=0;
        for(int i=0;i<V-1;i++){
            for(ArrayList<Integer> lt:edges){
                int u=lt.get(0);
                int v=lt.get(1);
                int d=lt.get(2);
                if(dis[u]!=(int)(1e8) && dis[u]+d<dis[v]){
                    dis[v]=dis[u]+d;
                }
            }
            for(ArrayList<Integer> lt:edges){
                int u=lt.get(0);
                int v=lt.get(1);
                int d=lt.get(2);
                if(dis[u]!=(int)(1e8) && dis[u]+d<dis[v]){
                    int temp[]=new int[1];
                    temp[0]=-1;
                    return temp;
                }
            }


        }
        return dis;
    }
    public static void main(String[] args) {

    }
}
