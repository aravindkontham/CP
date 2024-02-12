package CP.GRAPHS;

import java.util.*;

public class Flights_with_Min_Stops {
    public static int CheapestFLight(int n,int flights[][],int src,int dst,int k) {

        // Code here
        List<List<flights>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<flights>());
        }
        for(int i=0;i<flights.length;i++){
            adj.get(flights[i][0]).add(new flights(flights[i][1],flights[i][2]));
        }
        int dis[]=new int[n];
        for(int i=0;i<n;i++){
            dis[i]=(int)(1e9);
        }
        dis[src]=0;
        Queue<check> pq=new LinkedList<>();
        pq.add(new check(src,0,0));
        while (!pq.isEmpty()){
            int d=pq.peek().d;
            int cost=pq.peek().cost;
            int st=pq.peek().k;
            if(st>k) continue;
            pq.remove();
            for(int i=0;i<adj.get(d).size();i++){
                int nd=adj.get(d).get(i).d;
                int ncost=adj.get(d).get(i).cost;
                if(ncost+cost<dis[nd] && st<=k){
                    dis[nd]=ncost+cost;
                    pq.add(new check(nd,dis[nd],st+1));
                }

            }


        }
        for(int i=0;i<n;i++){
            if (dis[i]==(int)(1e9)) dis[i]=-1;
        }
        return dis[dst];

    }
    public static void main(String[] args) {

    }
}
class flights{
    int d;
    int cost;
    public flights( int d, int cost){
        this.d=d;
        this.cost=cost;
    }
}
class check{
    int d;
    int cost;
    int k;
    public check(int d, int cost, int k){
        this.d=d;
        this.cost=cost;
        this.k=k;
    }
}