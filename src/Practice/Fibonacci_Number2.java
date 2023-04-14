package Practice;

public class Fibonacci_Number2 {
    public static void main(String[] args){
        int fibo=6;
        int result=helper(fibo);
        System.out.println(result);
    }
    public static int helper(int fibo){
        int cur[]=new int[fibo+1];
        cur[0]=0;
        cur[1]=1;
        for(int i=2;i<=fibo;i++){
            cur[i]=cur[i-1]+cur[i-2];
        }
        return cur[fibo];
    }
}
//TC:O(n);
//SC:O(n);
