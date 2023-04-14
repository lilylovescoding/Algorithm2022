package Practice_9_Heap_in_Java;

import java.util.*;

//这是一个comparator  外部构造器  必须定义 compare(o1,o2)
public class comparator {
    public static void main(String[] args){

        PriorityQueue<Integer> list = new PriorityQueue<Integer>();     //堆序性 子>母  默认找最小的，找最优值。
        list.add(3);
        list.add(5);
        list.add(2);                                       //最小在顶，左右孩子顺序无法保证，孙子小于孩子
        list.add(4);
        System.out.println(list);                          //只能保证最小值，堆序性 子>母，左右孩子顺序无法保证，孙子小于孩子
        while (!list.isEmpty()) {                          //循环打印，顺序可以保证,默认升序
            System.out.print(list.poll() + " ,");
        }
        System.out.println();

        //这是一个comparator，改成降序
        PriorityQueue<Integer> list2 = new PriorityQueue<Integer>(new customComparator());  //传入一个comparator
        list2.add(3);
        list2.add(5);
        list2.add(2);
        list2.add(4);
        System.out.println(list2);                          //直接打印  顺序无法全部保证
        while (!list2.isEmpty()) {                          //循环打印，顺序可以保证
            System.out.print(list2.poll() + " ,");
        }
    }
}
class customComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1==o2){
            return 0;
        }else{
            return o1>o2?-1:1;
        }
    }
}
//区别：