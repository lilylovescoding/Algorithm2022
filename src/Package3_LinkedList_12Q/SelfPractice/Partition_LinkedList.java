package Package3_LinkedList_12Q.SelfPractice;

public class Partition_LinkedList {
    public static void main(String[] args){
        ListedList node1=new ListedList(2);
        ListedList node2=new ListedList(4);
        ListedList node3=new ListedList(3);
        ListedList node4=new ListedList(5);
        ListedList node5=new ListedList(1);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        System.out.println(node1.val);

        System.out.print("Orignial Linkedlist：");
        dayin(node1);


        System.out.print("partition Linkedlist：");
        ListedList result=partition(node1, 3);
        dayin(result);


    }
    public static void dayin(ListedList node){
        ListedList cur=node;
        while (cur!=null){
            System.out.print(cur.val+"-->");
            cur=cur.next;
        }
        System.out.println();
    }
    public static ListedList partition(ListedList head, int target){



        return head;
    }
}
