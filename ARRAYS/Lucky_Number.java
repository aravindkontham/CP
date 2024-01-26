package CP.ARRAYS;

public class Lucky_Number {
    public static void main(String[] args) {
        int n=136, counter=2;
        int temp=n;
        boolean flag=true;
        while(counter<=n){
            if(n%counter==0) {
                flag=false;
                break;
            }
            n=n-n/counter;
            counter++;
        }
        if(flag)
            System.out.println(temp+" is a lucky number");
        else
            System.out.println(temp+" is not a lucky number");
    }
}
