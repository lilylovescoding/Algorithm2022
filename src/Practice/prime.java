package Practice;

public class prime{
    public static void main(String[] args){
        int limit=20;
        for(int i = 8 ; i <= limit; i += 1){
            if(isPrime(i)){
                System.out.println(i + "是质数");
            }else{
                System.out.println(i+"不是质数");
            }
        }
    }
    public static boolean isPrime(int a){
        for (int b = 2; b <a; b++) {
            if (a % b == 0){
                return false;
            }
        }
        return true;
    }
}
