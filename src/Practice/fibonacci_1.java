package Practice;

public class fibonacci_1 {
    public static void main(String[] args){
        int k=7;
        System.out.println(fib(k));
    }
    public static int fib(int k){
        if ( k == 0){
            return 0;
        }else if ( k ==1 ){
            return 1;
        }

        return fib(k-1) + fib(k-2);
    }
}
