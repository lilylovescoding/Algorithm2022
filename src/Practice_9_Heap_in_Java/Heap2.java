package Practice_9_Heap_in_Java;

import java.util.*;

/**
 * 实验表明，在java中：
 * 1.toString()方法或迭代元素：优先级队列打印或者迭代，得到的输出顺序都为堆结构数组的顺序，大致有序但不完全保证顺序
 * 吴穹组长解释！！！只能保证最小值，堆序性 子>母，左右孩子顺序无法保证，孙子小于孩子
 *
 * 2.使用poll()方法：元素整体有序，但由于堆排序是不稳定排序，优先级相同的元素，不会保持原来的顺序输出
 * Created by cg on 2017/9/7.
 *
 */

public class Heap2 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        List<Character> bb = new ArrayList<Character>();
        for (int i = 'A'; i <= 'Z'; i++) {
            bb.add((char) i);            //把 i数值 转化为 char 类型
        }
        System.out.println(bb);
        //反转打印
        PriorityQueue<Character> cc = new PriorityQueue<Character>(Collections.reverseOrder());
        cc.addAll(bb);
        while (!cc.isEmpty()) {
            System.out.print(cc.poll() + " ,");
        }
        System.out.println();

        int i = 'A';
        System.out.println(i);

        for (int j = 'A'; j < 'Z'; j++) {
            System.out.print(j + " ");
        }
        System.out.println();


        Integer[] array = {9, 5, 2, 3, 6};

        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(Arrays.asList(array));  //将array转换为list对象
        System.out.println("原数组：" + Arrays.toString(array));                      //Array.toString是因为input 是 array，需要转string打印，否则是输出地址
        System.out.println("直接打印会得到顺序大致相同，但是不完全保证：" + minheap);

        System.out.print("使用api 方法poll（）逐一打印会得到正确结果 ：");
        while (!minheap.isEmpty()) {
            System.out.print(minheap.poll() + " ,");
        }
        System.out.println();

        List<Integer> list = Arrays.asList(3, 5, 2, 4, 6, 4, 33, 4, 6);
        Collections.sort(list);
        //Collections.reverseOrder(list);
        System.out.println("原数组Collections.sort(list)：" + list);

        PriorityQueue<Integer> minheap2 = new PriorityQueue<Integer>();
        minheap2.addAll(list);


        System.out.println("原数组：" + list);                                        //直接打印input是因为 input是 list ，直接打印其值
        System.out.println("直接打印会得到顺序大致相同，但是不完全保证：" + minheap2);
        System.out.print("使用api 方法poll（）逐一打印会得到正确结果 ：");
        while (!minheap2.isEmpty()) {
            System.out.print(minheap2.poll() + " ,");
        }
        System.out.println();

        List<Integer> list2 = Arrays.asList(3, 5, 2, 4, 6, 4, 33, 4, 6);
        PriorityQueue<Integer> minheap3 = new PriorityQueue<Integer>(Collections.reverseOrder());//传入一个compatator倒转
        minheap3.addAll(list2);
        System.out.print("更改Compatator来反转打印list2 : ");
        while (!minheap3.isEmpty()) {
            System.out.print(minheap3.poll() + " ,");
        }
    }
}
