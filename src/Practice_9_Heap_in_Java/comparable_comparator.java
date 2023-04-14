package Practice_9_Heap_in_Java;

import java.util.*;

//这是一个comparable  内部构造器（int，string 自然序）  必须重新定义 o1.compareTo(o2)

public class comparable_comparator {
    public static void main(String[] args) {

        PriorityQueue<shuzi> list = new PriorityQueue<shuzi>();  //shuzi类型本身就是有序的  默认找最小的，找最优值。
        shuzi a=new shuzi(3);
        shuzi b=new shuzi(5);
        shuzi c=new shuzi(2);
        shuzi d=new shuzi(4);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        while (!list.isEmpty()) {                          //循环打印，顺序可以保证
            shuzi cur=list.poll();
            System.out.print(cur.value+"，");
        }
        System.out.println();
    }
}
class shuzi implements Comparable<shuzi>{       //设计院员工，属性：年龄/身高，某个属性拿出来比较
    int value;
    public shuzi(int value){
        this.value=value;
    }
    @Override
    public int compareTo(shuzi o) {
        if(this.value==o.value){
            return 0;
        }
        return this.value>o.value?-1:1;
    }
}





//    List<shuzi> list2 = new ArrayList<shuzi>();
//        shuzi e=new shuzi(3);
//        shuzi f=new shuzi(5);
//        shuzi g=new shuzi(2);
//        shuzi h=new shuzi(4);
//        list2.add(e);
//        list2.add(f);
//        list2.add(g);
//        list2.add(h);
//
//        shuzi bb=list2.get(1);
//        System.out.println(bb.value);


