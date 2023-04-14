package Practice.passByValue_ShollowDeep_copy;

import java.util.Arrays;

//deep_copy  关键字new，就是在heap开了个新空间，用于储存复制了列表值,就是heap上面存在两份值；
public class copy_deep {
    public static void main(String[]args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b =deep_copy(a);  //深度copy
        System.out.println("原列表a是："+ Arrays.toString(a));
        System.out.println("deep_copy b列表是："+Arrays.toString(b));

        b[2]=50;        //此时a和b分别指向两个值[1,2,3,4,5]和[1,2,3,4,5],我改变b引用指向的值，a引用指向的值不会改变，因为a和b两个地址指向两个值；
        System.out.println("此时列表a是："+Arrays.toString(a));
        System.out.println("此时列表b是："+Arrays.toString(b));
    }
    private static int[] deep_copy(int[]a){
        int[]b=new int[a.length];    //关键字new，就是在heap开了个新空间，用于储存复制了a列表值；
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        return b;
    }

}
