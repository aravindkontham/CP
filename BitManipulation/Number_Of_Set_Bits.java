package CP;

import java.util.Scanner;

public class Number_Of_Set_Bits {
    public static int Method_1(int num){
        int count=0;
        while(num!=0){
            if((num & 1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }

    public static int Method_2(int num){
        int count=0;
        while(num!=0){
            num=num&(num-1);
            count++;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        System.out.println("Number of SET bits are: "+Method_1(num));
        System.out.println("Number of SET bits are: "+Method_2(num));

    }
}
