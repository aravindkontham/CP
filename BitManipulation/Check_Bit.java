package CP;

import java.util.Scanner;

public class Check_Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        System.out.print("Enter the bit number:");
        int i= sc.nextInt();
        if((num&1<<i)==0){
            System.out.println("it is not a SET bit");
        }
        else
            System.out.println("it is a Set Bit");
    }
}
