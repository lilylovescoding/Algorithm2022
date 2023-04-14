package Package3_LinkedList_12Q;


public class S2_MergeSort_LinkedList {
    //mergesort的三套组合拳的应用；组合拳（reverse，find middle，merge)
    public static void main(String[]args){
        Integer[]array = {22,99,11,44,66,77,88};
        Linkedlist3 unsortedLink=constructArray(array);
        //得到一个未排序好的链表
        dayin(unsortedLink);

        // mergesor 组合拳（find middle ，mergesort)

        //step 1 findMiddle：快慢指针
        Linkedlist3 middle = findMiddle(unsortedLink);
        System.out.println("unsortedLink中点为 "+middle.val);

        //step 2 mergeSort 将两段用采用recursion的方式排序  并用谁小移谁的方式来merge
        Linkedlist3 sortlist = mergeSort(unsortedLink);
        dayin(sortlist);
        //step 3 merge 合并两个sorted list：谁小移谁 dummy

    }
    private static Linkedlist3 findMiddle(Linkedlist3 list){    // 1 2 3   // 1 2 3 4
        Linkedlist3 slow = list ;
        Linkedlist3 fast = list ;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private static Linkedlist3 mergeSort(Linkedlist3 list){
        //base case
        if (list==null||list.next==null){
            return list ;
        }
        //找中点
        Linkedlist3 middle1=findMiddle(list);
        Linkedlist3 middle2=middle1.next;
        middle1.next=null;
        //分别sort
        Linkedlist3 left = mergeSort(list);
        Linkedlist3 right = mergeSort(middle2);
        //合并两个link
        return merge(left,right);

        //TC:O(nlogn)
        //SC:O(logn)


    }
    private static Linkedlist3 merge(Linkedlist3 list1,Linkedlist3 list2){ //谁小移谁
        Linkedlist3 dummy = new Linkedlist3(-1);
        Linkedlist3 cur = dummy ;
        while(list1!=null&&list2!=null){
            if(list1.val< list2.val){
                cur.next=list1;
                list1=list1.next;
            }else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        if(list1!=null){
            cur.next=list1;
        }
        if(list2!=null){
            cur.next=list2;
        }
        return dummy.next;
    }
    private static Linkedlist3 constructArray(Integer[] array){
        Linkedlist3 head1= new Linkedlist3();
        head1.val=1;

        Linkedlist3 head = new Linkedlist3(array[0]);
        Linkedlist3 cur = head;
        for(int i =1 ; i<array.length;i++){
            cur.next = new Linkedlist3(array[i]);
            cur=cur.next;
        }
        return head;
    }
    private static void dayin(Linkedlist3 link){
        Linkedlist3 cur = link ;
        while(cur!=null){
            System.out.print(cur.val+"-->");
            cur=cur.next;
        }
        System.out.println();
    }
}

class Linkedlist3{
    int val;
    Linkedlist3 next;

    Linkedlist3(){
    }

    Linkedlist3(int val){
        this.val=val;
    }
}
