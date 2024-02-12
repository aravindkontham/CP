package CP.GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycle_Directed_Graph_Topo_Sort {
    static boolean topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int deg[] = new int[V];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < adj.size(); i++) {
            for (int it : adj.get(i)) {
                deg[it]++;
            }
        }

        for (int i = 0; i < V; i++) {
                if (deg[i] == 0) {
                    q.add(i);
                }
        }
            int count=0;
            while(!q.isEmpty()){
                int node=q.poll();
                count++;
                for(int it:adj.get(node)) {
                    deg[it]--;
                    if (deg[it] == 0)
                        q.add(it);
                }
            }
            if(count!=V) return false;
            return true;
    }
    public static void main(String[] args) {

    }
}
