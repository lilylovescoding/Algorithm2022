package Package10_Recursion2_8Q.SelfPractice;

public class Recursion_Power {
    public static void main(String[] args){
        int a=2;
        int b=3;
        int t= power(a,b);
        System.out.println(1/2);
        System.out.println(t);
    }
    public static int power(int a, int b){
        if(b==0){
            return 1;
        }
        int half=power(a,b/2);
        if(b%2==0){
            return half*half;
        }else{
            return half*half*a;
        }
    }
}
