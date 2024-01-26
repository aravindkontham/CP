package CP.BinarySearch;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[]={23,45,66,71,-23,6,70};
        int k=3;
        int w_sum=0,m_sum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            w_sum+=arr[i];
        }
        m_sum=Math.max(w_sum,m_sum);
        for(int i=k;i<arr.length;i++){
            w_sum=w_sum+arr[i]-arr[i-k];
            m_sum=Math.max(w_sum,m_sum);
        }
        System.out.println(m_sum);
    }
}
