package Practice_6_Queue_Stack_Deque;
import java.util.*;
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}

public class ConstructListNode {
    public static void main(String[] args){
        Integer[] array={11,22,33,44,55};
        ListNode a = constructListNode(array);
        System.out.print("[11,22,33,44,55]转化为联系列表：");
        dayin1(a);
        System.out.println("检查a.next是否为22，a.next.next是否为33。答案是的"+" "+a.next.val+" "+a.next.next.val);
        List<Integer> b=deConstructListNode(a);
        System.out.println("将联系列表再转化为数列："+b);
        int c=listNodeLength(a);
        System.out.println("这个ListNode数列长度为 "+c);

    }
    public static void dayin1(ListNode node){
        ListNode cur=node;
        while (cur!=null){
            System.out.print(cur.val+"-->");
            cur=cur.next;
        }
        System.out.println();
    }
    public static ListNode constructListNode(Integer[] array){
        if(array.length == 0){
            return null;
        }
        ListNode root=new ListNode(array[0]);
        int index=0;
        return constructListNode(array,root,index);
    }
    public static ListNode constructListNode(Integer[]array,ListNode root,int index){
        if(index<array.length){
            if(array[index]==null){
                return null;
            }
            root=new ListNode(array[index]);
            root.next=constructListNode(array,null,index+1);
        }
        return root;
    }
    public static List<Integer> deConstructListNode(ListNode a){
        List<Integer> array2=new ArrayList<>();
        deConstructListNode(a,array2);
        return array2;
    }
    public static void deConstructListNode(ListNode a, List<Integer> array2){
        if(a==null){
            return;
        }
        array2.add(a.val);
        deConstructListNode(a.next,array2);
    }
    public static int listNodeLength(ListNode a){
        if(a==null){
            return 0;
        }
        return listNodeLength(a.next)+1;
    }
}
