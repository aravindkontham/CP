package CP.GRAPHS;

import java.util.ArrayList;
import java.util.List;

public class Disjoint_Set {
    public static void main(String[] args) {
        DisjointSet ds=new DisjointSet(7);
        ds.unionByRank(1,2);
        ds.unionByRank(2,3);
        ds.unionByRank(4,5);
        ds.unionByRank(6,7);
        ds.unionByRank(5,6);

        if(ds.findUpar(3)==ds.findUpar(7))
            System.out.println("Same");
        else
            System.out.println("Not Same");

        ds.unionByRank(3,7);
        if(ds.findUpar(3)==ds.findUpar(7))
            System.out.println("Same");
        else
            System.out.println("Not Same");

    }


}

class DisjointSet{
    List<Integer> rank=new ArrayList<>();
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
    //    Constructor:
    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    //    FindParent
    public int findUpar(int node){
        if(node==parent.get(node))
            return node;
        int ulp=findUpar(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }
    //    UnionByRank
    public void unionByRank(int u, int v){
//        1.Find the ultimate parents of U and V
        int ulp_u=findUpar(u);
        int ulp_v=findUpar(v);
        if(ulp_u==ulp_v) return;
//        2.Find Ranks of Pu and Pv
        if(rank.get(ulp_u)<rank.get(ulp_v))
            parent.set(ulp_u,ulp_v);
        else if(rank.get(ulp_v)<rank.get(ulp_u))
            parent.set(ulp_v,ulp_u);
//        If ranks are equal connect anything to anyone
        else
        {
            parent.set(ulp_v,ulp_u);
            int rankU=rank.get(ulp_u);
            rank.set(ulp_u,rankU+1);
        }
    }
    public void UnionBySize(int u, int v){
        int ulp_u=findUpar(u);
        int ulp_v=findUpar(v);
        if(ulp_u==ulp_v) return;
        if(size.get(ulp_u)<size.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_v)+size.get(ulp_u));
        }
        else
        {
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
        }
    }

}
