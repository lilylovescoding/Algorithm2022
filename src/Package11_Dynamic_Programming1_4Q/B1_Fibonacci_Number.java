package Package11_Dynamic_Programming1_4Q;

public class B1_Fibonacci_Number {
    public static void main(String[] args){
        int t=5;
        int result=fi(t);
        System.out.println(result);
    }
    public static int fi(int t){
        int[]cur=new int[t+1];
        cur[1]=1;
        for(int i=2;i<=t;i++){
            cur[i]=cur[i-1]+cur[i-2];
        }
        return cur[t];
    }
}
