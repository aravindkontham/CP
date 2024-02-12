package CP.ARRAYS;

import java.util.*;

public class Asteroids {
    public static int[] asteroidCollision(int[] arr) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty() || arr[i]>0){
                st.push(arr[i]);
            }
//            Negative value
            else
            {
                while(!st.isEmpty()){
                    int top=st.peek();
                    if(top<0){
                        st.push(arr[i]);
                        break;
                    }
                    int abs=Math.abs(arr[i]);
                    if(top==abs){
                        st.pop();
                        break;
                    }
                    if(top<abs){
                        st.pop();
                        if (st.isEmpty()) {
                            st.push(arr[i]);
                            break;
                        }
                    }
                    else
                    {
                        break;
                    }

                }
            }
        }
        int n=st.size();
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[]={5,10,-5};
        asteroidCollision(arr);

    }

}
