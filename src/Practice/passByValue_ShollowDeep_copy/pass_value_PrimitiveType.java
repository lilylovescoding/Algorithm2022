package Practice.passByValue_ShollowDeep_copy;

//pass by value - primitive type ,复制一个值。
public class pass_value_PrimitiveType {
    public static void main(String[] args){
        int money=5;
        System.out.println("我的钱是 "+ money +"元");

        gehuawoqian(money); //我的钱复制一份给哥，哥拿去花，不管怎么花，我的钱还是不变。（pass by value，复制一份value给哥）
        System.out.println("此时我的钱还是 "+ money +"元");

        int rest = gehuawoqian(money); //我的钱复制一份给哥，哥拿去花了1块钱，此时哥剩下的钱是rest，我的钱不变。（pass by value，复制一份value给哥）
        System.out.println("此时哥的钱剩余 "+ rest +"元");
        System.out.println("此时我的钱还是 "+ money +"元");

    }
    private static int gehuawoqian(int a ){  //方法：哥花我的钱，就是复制一份钱给哥。
        a =a-1;
        return a;
    }
}
