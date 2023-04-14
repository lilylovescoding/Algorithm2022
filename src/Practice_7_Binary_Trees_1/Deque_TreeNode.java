package Practice_7_Binary_Trees_1;

import java.util.*;

class TreeNode2{
    int val;
    TreeNode2 next;
    public TreeNode2(int val){
        this.val=val;
    }
}
public class Deque_TreeNode {
    public static void main(String[] args) {
        Integer[] array = {10, 20, 30, 40, 50};
        TreeNode2 a = construct(array);
        System.out.print("联系列表：");
        dayin2(a);
        Deque<TreeNode2>stack=new ArrayDeque<TreeNode2>();
        stack.offerFirst(a);
        stack.offerFirst(a.next);
        TreeNode2 b=stack.peekFirst();
        System.out.println(stack);
        System.out.println(b.val);

    }
    public static void dayin2(TreeNode2 node) {
        TreeNode2 cur = node;
        while (cur != null) {
            System.out.print(cur.val + "-->");
            cur = cur.next;
        }
        System.out.println();
    }
    public static TreeNode2 construct(Integer[] array){
        if(array.length == 0){
            return null;
        }
        TreeNode2 root=new TreeNode2(array[0]);
        int index=0;
        return constructListNode(array,root,index);
    }
    public static TreeNode2 constructListNode(Integer[]array,TreeNode2 root,int index) {
        if (index < array.length) {
            if (array[index] == null) {
                return null;
            }
            root = new TreeNode2(array[index]);
            root.next = constructListNode(array, null, index + 1);
        }
        return root;
    }
}

