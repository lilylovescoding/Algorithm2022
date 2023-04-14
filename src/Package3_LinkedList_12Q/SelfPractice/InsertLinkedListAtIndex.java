package Package3_LinkedList_12Q.SelfPractice;

class ListNode{
    int value;
    ListNode next;
    public ListNode(int value){
            this.value = value;
            next = null;
    }
}

public class InsertLinkedListAtIndex {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(11);
        ListNode node2 = new ListNode(22);
        ListNode node3 = new ListNode(33);
        ListNode node4 = new ListNode(44);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        int a = count(node1);
        System.out.println(a);

        print(node1);

        ListNode newResult = insert(node1,0,88);
        print(newResult);
    }

    public static void print(ListNode node1){
        ListNode cur = node1;
        while(cur != null) {
            System.out.print(cur.value + "-->");
            cur = cur.next;
        }
        System.out.println();
    }

    //计算出LinkedList的长度
    public static int count(ListNode head){
        if(head == null){        //corner case
            return 0;
        }

        int count = 0;
        ListNode cur = head;   //如果用head直接跑就会失去对头指针的控制
        while(cur !=null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public static ListNode insert(ListNode head, int index, int value) {
        if (head == null ){
            return null;
        }

        ListNode newNode = new ListNode(value);
        int position = count(head);

        if (index < 0) {
            return null;
        } else if (index == 0) {
            newNode.next = head;
            return newNode;
        } else {
            ListNode cur = head;
            ListNode prev = null;
            int i = 0;
            while(i != index) {
                i++;
                prev = cur;
                cur = cur.next;
            }
            //newNode = cur;
            prev.next = newNode;
            newNode.next = cur;
            return head;
        }
    }
}