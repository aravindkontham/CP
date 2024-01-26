package CP;

import java.util.Scanner;

public class Factorial_without_multi_operator {
    public static void main(String[] args) {
//        Solvay Strassen algorithm
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n=sc.nextInt();
        int sum=n;
        if(n==0) sum=1;
        for(int i=n-1;i>=1;i--){
            int temp=i;
            int ans=0;
            while(temp--!=0){
                ans=ans+sum;
            }
            sum=ans;
        }
        System.out.println("The factorial of "+n+" is :"+sum);
    }
}
