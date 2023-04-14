package Practice_6_Queue_Stack_Deque;

import java.util.*;

public class ArrayListInterface {
    public static void main(String[] args){
        TreeNode2 node1=new TreeNode2(10);
        TreeNode2 node2=new TreeNode2(30);
        TreeNode2 node3=new TreeNode2(50);
        TreeNode2 node4=new TreeNode2(70);
        TreeNode2 node5=new TreeNode2(90);

        node1.next=node2;
        node2.next=node3;

        node4.next=node5;


        List<Integer> res=new ArrayList<>();
        System.out.println(res);
        res.add(1);
        res.add(2);
        res.add(3);
        System.out.println(res);
//        res.remove(1);
//        System.out.println(res);

        Deque<TreeNode2>stack=new ArrayDeque<TreeNode2>();
        stack.offerFirst(node1);
        TreeNode2 cur=stack.pollFirst();
        System.out.println(cur.val);
        System.out.println(cur.next.val);

        stack.offerFirst(node4);
        TreeNode2 cur2=stack.pollFirst();
        System.out.println(cur2.val);
        System.out.println(cur2.next.val);
        stack.peek();
        System.out.println();

    }
}
class TreeNode2 {
    int val;
    TreeNode2 next;

    public TreeNode2(int val) {
        this.val = val;
    }
}
