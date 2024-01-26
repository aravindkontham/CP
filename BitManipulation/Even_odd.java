package CP;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        if((num&1)==0){
            System.out.println(num +" is Even");
        }
        else
            System.out.println(num +" is odd");
    }
}
