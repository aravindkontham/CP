package CP.Recurrsion;

import java.util.Scanner;

public class Permutations {
    public static void swap(char arr[],int i, int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void printPerm(char arr[], int index){
        if(index==arr.length-1){
            System.out.println(arr);
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr,i,index);
            printPerm(arr,index+1);
            swap(arr,i,index);
        }
    }
    public static void num_swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void perm(int arr[],int ind){
        if(ind==arr.length-1){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=ind;i<arr.length;i++){
            num_swap(arr,i,ind);
            perm(arr,ind+1);
            num_swap(arr,i,ind);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        printPerm(s.toCharArray(),0);
        int arr[]={1,2,3,4};
        perm(arr,0);
    }
}
