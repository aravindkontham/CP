package CP.GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Network_DelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        int dis[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dis[0]=0;
        dis[k]=0;
        ArrayList<ArrayList<delay>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<delay>());
        }
        for(int i=0;i<times.length;i++){
            adj.get(times[i][0]).add(new delay(times[i][1],times[i][2]));
        }
        Queue<delay> q=new LinkedList<>();
        // for(ArrayList<pair> it: adj.get(k)){
        //     q.add(new pair(it.get(0),it.get(1));)
        // }
        q.add(new delay(k,0));
        while(!q.isEmpty()){
            int u=q.peek().n;
            q.remove();
            for(int i=0;i<adj.get(u).size();i++){
                delay dl=adj.get(u).get(i);
                int v=dl.n;
                int nd=dl.d;
                if(dis[u]+nd<dis[v]){
                    dis[v]=dis[u]+nd;
                    q.add(new delay(v,nd));
                }
            }
        }
        int min=0;
        for(int i=0;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE) return -1;
            if(dis[i]>min){
                min=dis[i];
            }
        }
        return min;


    }
    public static void main(String[] args) {

    }
}

class delay{
    int n;
    int d;
    public delay(int n, int d){
        this.n=n;
        this.d=d;
    }
}
