package Data_Structure;
import java.util.LinkedList;

public class LinkedList_API_test {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        list.addLast(0);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);

        list.add(0,11);
        System.out.println(list);

        list.add(2,22);
        System.out.println(list);

        LinkedList<Integer> list2=reverseList(list);




    }
    private static LinkedList<Integer> reverseList(LinkedList<Integer> list){
        LinkedList<Integer> pre=null;
        LinkedList<Integer> next=null;
        LinkedList<Integer> cur=list;




        return list;

    }
}
