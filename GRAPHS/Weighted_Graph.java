package CP.GRAPHS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Weighted_Graph {
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Map<Integer,Integer>>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
            adj.get(i).add(new HashMap<Integer,Integer>());
        }

        adj.get(1).add(3,new HashMap<>(4,2));


        adj.get(1).get(1).put(2,2);
        adj.get(1).get(1).put(3,2);

        adj.get(2).get(2).put(5,1);
        adj.get(2).get(2).put(4,2);

        adj.get(3).get(3).put(4,2);
        adj.get(3).get(3).put(1,2);

        adj.get(4).get(4).put(2,2);
        adj.get(4).get(4).put(3,4);

        adj.get(5).get(5).put(2,2);
        adj.get(5).get(5).put(4,6);

//
        for (int i=0;i<adj.size();i++){
            for (int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
