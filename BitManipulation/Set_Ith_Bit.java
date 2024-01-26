package CP;

import java.util.Scanner;

public class Set_Ith_Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        System.out.print("Enter the bit number:");
        int i= sc.nextInt();
        int mask=1<<i;
        int result=mask|num;
        System.out.println("Number after clearing "+i+"th bit:"+result);
    }
}
