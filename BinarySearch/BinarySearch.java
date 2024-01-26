package CP.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int search=8;
        int left=arr[0], right=arr[arr.length-1];
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==search) {
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>search)
                right=mid-1;
            else if(arr[mid]<search)
                left=mid+1;
        }
    }
}
