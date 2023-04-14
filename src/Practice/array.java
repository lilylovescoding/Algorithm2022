package Practice;

import java.util.Arrays;

public class array {
    public static void main (String[] args){

        int[] b=new int[5];
        System.out.println(Arrays.toString(b));
        adda(b);     //javac传 reference, b改变了
        System.out.println(Arrays.toString(b));

        int c= 5;
        System.out.println(c);
        shopping(c); //jave传值  pass by value  ，c没变
        System.out.println(c);

    }
    private static void shopping(int c) {  //pass by value；copy；  自己不变
        c=c-1;
//        System.out.println(c);
        return;
    }
    private static void adda(int[] b){      //传参数（地址针对的值）；  不copy；自己跟着变
        b[0]=1;
        return;
    }
}
