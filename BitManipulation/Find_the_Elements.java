package CP;

import java.util.Scanner;

public class Find_the_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

//        finding the xor of all elements
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }

//        finding the index of rightmost set bit of xor
        int count=0;
        while(xor!=0){
            if((xor&1)==1){
                break;
            }
            count++;
            xor=xor>>1;
        }

//        segregating array into two sets
        int xor1=0,xor2=0;
        for(int i=0;i<n;i++){
            if((arr[i]&1<<count)==1){
                xor1=xor1^arr[i];
            }
            else
                xor2=xor2^arr[i];
        }

//        printing the elements which repeated only once.
        System.out.println(xor1);
        System.out.println(xor2);
    }
}
