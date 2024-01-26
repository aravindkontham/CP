package CP.Recurrsion;

public class Parenthesis {
    public static void print(String s, int open,int close, int n){
        if(close==n) {
            System.out.println(s);
            return;
        }
        if(open<n){
            print(s+"(",open+1,close,n);
        }
        if(close<open){
            print(s+")",open,close+1,n);
        }
    }

    public static void main(String[] args) {
        String res="(";
        print(res,1,0,4);

    }
}
