package Practice.passByValue_ShollowDeep_copy;

import java.util.Arrays;

//shallow_copy，只是复制引用（黄色小纸条）；heap上面的值还是唯一的一个值。
public class copy_shallow {
    public static void main(String[]args){
        int[]a=new int[]{1,2,3,4,5};
        int[]b=a;                          //这个就是shallpw copy，直接将引用（地址）a 复制给b；此时a和b同时指向同一个值[1,2,3,4,5]；
        System.out.println("原列表a是："+ Arrays.toString(a));
        System.out.println("shallow_copy b列表是："+Arrays.toString(b));

        b[2]=50;                          //此时a和b同时指向同一个值[1,2,3,4,5],我改变b引用指向的值，a引用指向的值也会改变，因为a和b两个地址指向一同一个值；
        System.out.println("此时列表a是："+Arrays.toString(a));
        System.out.println("此时列表b是："+Arrays.toString(b));
    }
}
