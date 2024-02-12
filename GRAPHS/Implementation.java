package CP.GRAPHS;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Implementation {
    public static void main(String[] args) {
        int n=5, m=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }
//        edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

//        edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

//        edge 4--3
        adj.get(4).add(3);
        adj.get(3).add(4);

//        edge 4--1
        adj.get(4).add(1);
        adj.get(1).add(4);

//        edge 5--4
        adj.get(5).add(4);
        adj.get(4).add(5);

//        edge 3--5
        adj.get(5).add(3);
        adj.get(3).add(5);

//        Printing
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
