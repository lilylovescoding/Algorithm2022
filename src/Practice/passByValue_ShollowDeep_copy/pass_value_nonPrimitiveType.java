package Practice.passByValue_ShollowDeep_copy;

import java.util.Arrays;

//pass by value - non-primitive type 是指复制一份引用（黄色小纸条），此引用指向的同一个head上的值，所以直接改的值。
public class pass_value_nonPrimitiveType {
    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5};
        System.out.println("原始数据是 "+Arrays.toString(a));

        gaibian(a);    //把引用a传进来就是，就是复制一份引用（黄色小纸条），此引用指向的同一个head上的值，对这个引用操作就是对原引用指向的值进行操作。
        System.out.println("改变了原数据，现在的数据是 "+Arrays.toString(a));
    }
    private static void gaibian(int[]a){
        a[2]=5;
        return;
    }

}
