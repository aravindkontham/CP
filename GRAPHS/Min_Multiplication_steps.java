package CP.GRAPHS;

import java.util.LinkedList;
import java.util.Queue;

public class Min_Multiplication_steps {
    int minimumMultiplications(int[] arr, int start, int end) {
        Queue<steps> q=new LinkedList<>();
        q.add(new steps(start,0));
        int dis[]=new int[100000];
        for(int i=0;i<dis.length;i++) dis[i]=(int)(1e9);
        while (!q.isEmpty()){
            int node=q.peek().node;
            int st=q.peek().steps;
            dis[node]=st;
            for(int i=0;i<arr.length;i++){
                int n_start=(node*arr[i])*100000;
                if(n_start<=end && st<dis[n_start]){
                    dis[n_start]=st;
                    q.add(new steps(n_start,st+1));
                }
            }
        }
        return dis[end];



    }
    public static void main(String[] args) {

    }
}
class steps{
    int node;
    int steps;
    public steps(int node, int steps){
        this.node=node;
        this.steps=steps;
    }
}