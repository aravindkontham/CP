package CP.Recurrsion;

public class Tower_Of_Hanoi {
    public  static  void print(int n,String s, String h, String d){
        if(n==1)
        {
            System.out.println("Move "+1+" from "+s+" to "+d);
            return;
        }
        print(n-1,s,d,h);
        System.out.println("Move "+n+" from "+s+" to "+d);
        print(n-1,h,s,d);
    }
    public static void main(String[] args) {
        print(3,"S","H","D");

    }
}
