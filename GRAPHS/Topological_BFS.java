package CP.GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_BFS {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int in_d[]=new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                in_d[it]+=1;
            }
        }
        int top[]=new int[V];
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(in_d[i]==0){
                q.add(i);
            }
        }
        int i=0;
        while(!q.isEmpty()) {
            int node = q.poll();
            top[i++] = node;
            for (int it : adj.get(node)) {
                in_d[it]--;
                if(in_d[it]==0)
                    q.add(it);

            }
        }
        return top;

    }
    public static void main(String[] args) {

    }
}
