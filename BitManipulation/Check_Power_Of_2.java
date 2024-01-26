package CP;

import java.util.Scanner;

public class Check_Power_Of_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if((num & num-1)==0){
            System.out.println("Power of 2");
        }
        else
            System.out.println("Not a power of 2");
    }
}
