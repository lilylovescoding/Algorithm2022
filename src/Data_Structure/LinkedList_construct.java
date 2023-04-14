package Data_Structure;

public class LinkedList_construct {
    public static void main(String[] args){
        //传统构建linkedlist
        Linkedlist1 node1=new Linkedlist1(11);
        Linkedlist1 node2=new Linkedlist1(22);
        Linkedlist1 node3=new Linkedlist1(33);
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        print(node1);

        //函数方法构造linkedlist
        Integer[] array = {111,222,333,444,555,666};
        Linkedlist1 link= construct(array);
        print(link);

        //头值
        //System.out.println(link.val);

        //迭代反转linkedlist
        Linkedlist1 link2=reverseInterative(link);
        print(link2);

        //反转双向链表(double linkedlist)


        //递归反转linkedlist

        //Q1 : find middle node of a linkedlist; 快慢指针法 ； fast 和 slow ； 出循环的条件 fast.next = null ;
        Linkedlist1 middle = findMiddle(link2);             //1  2  3  4  5   //  1 2 3 4    slow & slow.next
        System.out.println("中间点为： "+middle.val);

        //Q2 : 快慢指针检查是否有环；只要没追上，一直快慢指针；

        //Q3 : insert  a node in a sorted linkedlist;

        //Q4 : merge two sorted linkedlis t into one longsorted linkedlist;

        //找中点；
        //劈成两半；
        //dummy；

        //Q5 : 两两交换；

        //组合拳
        //Z1 ： MergeSorted LinkedList ;
        //Z2 : Add Two Numbers ;
        //Z3 : Check if a linkedlist is palindrome ;
        //Z4 : Remove all nodes with target walue ;




    }
    private static void print(Linkedlist1 node1){
        Linkedlist1 cur = node1;
        while (cur!=null){
            System.out.print(cur.val+"-->");
            cur=cur.next;
        }
        System.out.println();
    }
    private static Linkedlist1 construct(Integer[] array){
        Linkedlist1 root=new Linkedlist1(array[0]);
        Linkedlist1 cur = root;
        for(int i = 1 ; i<array.length;i++){
            cur.next=new Linkedlist1(array[i]);
            cur=cur.next;
        }
        return root;
    }
    private static Linkedlist1 reverseInterative(Linkedlist1 list){
        Linkedlist1 pre = null;
        while (list!=null){
            Linkedlist1 next = list.next;
            list.next=pre;
            pre=list;
            list=next;
        }
        return pre;
    }
    private static Linkedlist1 findMiddle(Linkedlist1 list){    // 1 2 3   // 1 2 3 4
        Linkedlist1 slow = list ;
        Linkedlist1 fast = list ;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.next;
    }
}
class Linkedlist1{
    int val;
    Linkedlist1 next;

    Linkedlist1(int val){
        this.val=val;
    }
}
