package CP.ARRAYS;

public class RotateArray {
    static void reverse(int arr[], int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    static void rotate(int arr[], int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        int k=4001;
        rotate(arr,k);
        System.out.println("Array  after rotating "+k+" times:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
