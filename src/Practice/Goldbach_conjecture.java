package Practice;

//哥德巴赫猜想：任何大于2的偶数，都是两个质数之和。质数：只能被1和其本整除的整数，就是质数。
public class Goldbach_conjecture {
    //定义一个结论，检测4-1000之间的偶数num，是否每一个偶数num都符合哥德巴赫猜想
    public static void main(String[] args){
        int limit=1000;
        for(int num = 4 ; num <= limit ; num += 2){
            if(checkGoldbach(num)){
                System.out.println(num + "符合哥德巴赫猜想");
            }else{
                System.out.println("恭喜你，找到了哥德巴赫猜想的反例");
                break;
            }
        }
    }
    //检测偶数num是否满足两个质数prime之和，i和num-i
    public static boolean checkGoldbach(int num){
        for (int i=2;i<num;i++){
            if (isPrime(i) && isPrime(num-i)){
                return true;
            }
        }
        return false;
    }
    //定义质数：prime。检测i是否能被 2到（i-1）之间到整数整除（余数等零）若能，那i就不是质数，返回false。
    public static boolean isPrime(int i){
        for (int j  =2; j<i ; j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }

}

