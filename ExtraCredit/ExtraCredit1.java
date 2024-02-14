package ExtraCredit;

public class ExtraCredit1{
    public static void main(String[] args) {
        System.out.println(fibonnaci(7));
    }
    public static int fibonnaci(int n){
        int x = 0;
        int j = 1;
        if(n < 1){
            return 0;
        }
        for(int i = 0; i < n-2; i++){
            int temp = x + j;
            x = j;
            j = temp;
            System.out.println(x + " " + j);
        }
        return j;
    }
}