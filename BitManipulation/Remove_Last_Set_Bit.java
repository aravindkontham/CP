package CP;

import java.util.Scanner;

public class Remove_Last_Set_Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        num=num&(num-1);
        System.out.println(num);
    }
}
