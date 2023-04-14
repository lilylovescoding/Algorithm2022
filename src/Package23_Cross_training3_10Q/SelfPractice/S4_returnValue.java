package Package23_Cross_training3_10Q.SelfPractice;

import java.util.PriorityQueue;

public class S4_returnValue {
    public static void main(String[] args){
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        minHeap.offer(9);
        minHeap.offer(2);
        minHeap.offer(1);
        minHeap.offer(5);
        System.out.println(minHeap.peek());
        minHeap.poll();
        minHeap.poll();
        System.out.println(minHeap.peek());

        int[][]array={{1,2,3},{2,3,4},{3,4,5},};
        int e=array.length;
        System.out.println(e);
    }
}
