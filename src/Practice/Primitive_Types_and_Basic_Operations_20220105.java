package Practice;

public class Primitive_Types_and_Basic_Operations_20220105 {
    public static void main(String[] args){
        //Description: Given two integer a and b,calculate a divide by b but maintain the precision.
        //问题描述1：给两个整数a和b，用a除以b，并保留结果的精度。
        int a = 3;
        int b = 7;
        double c =a/((double)b);
        System.out.println(c);

        //Description: Check if the number x is even,return true for even number.
        //问题描述2：检验数值x是否为偶数，如果是，返回true。
        int x = 13872;
        boolean d =((x&2)==0);
        System.out.println(d);

        //Description:Check if the given number e and f are equal.
        //问题描述3：检验数值e和f是否相等，如果相等，返回true。
        int e = 5;
        int f = 5;
        boolean g =(e==f);
        System.out.println(g);

        //Description: Check if the number h and i are roughly equal,the allowed error is lower than 0.0001.
        //问题描述4：检验数值h和i是否大致相等，两个值的允许误差小于0。0001。
        double h = 1.123456;
        double i = 1.123457;
        boolean j = (Math.abs(Math.abs(h)-Math.abs(i))<0.0001);
        System.out.println(j);

        //Description: 问题描述5：
        //Given two strings,concratenate them into one,separated by a comma.给两个字符串，将他们组合位一个，并用逗号隔开。
        //Example:例子：
        //first string:"hello" 第一个字符串："hello"
        //second string:"world"第二个字符串："world"
        //result:"hello,world" 结果："hello，world"
        String k = "hello";
        String l = "world";
        String m = k + ','+l;
        System.out.println(m);
    }
}
