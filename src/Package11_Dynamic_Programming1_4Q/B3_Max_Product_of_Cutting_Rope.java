package Package11_Dynamic_Programming1_4Q;

public class B3_Max_Product_of_Cutting_Rope {
    public static void main(String[] args){
        int rope_length=3;
        int result=kan(rope_length);
        System.out.println(rope_length+"长的绳子至少砍一刀，两侧最大乘积为"+result+"米。");

    }
    public static int kan(int rope_length){
        int[]rope=new int[rope_length+1];
        rope[0]=0;
        rope[1]=0;
        for(int meter=2;meter<=rope_length;meter++){  //绳子至少2m长才能有至少坎一刀的情况；
            for(int zuo=1;zuo<meter;zuo++){           //砍完一刀后左边至少有1m长；
                rope[meter]=Math.max(rope[meter],Math.max(zuo,rope[zuo])*(meter-zuo));
            }                                    //左不砍（至少1m），左边至少砍一刀的历史最大乘积值 *（右边剩下的部分）
        }
        return rope[rope_length];
    }
}
