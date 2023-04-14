package Practice_9_Heap_in_Java;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args){
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        minHeap.offer(4);
        minHeap.offer(1);
        minHeap.offer(2);
        minHeap.offer(3);
        minHeap.offer(7);

        System.out.println(minHeap);
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());

    }
}
//Implementation Of Min Heap // Practice 10
class MinHeap{
    int[]array;
    int size;
    public MinHeap(int[] array) throws IllegalAccessException {
        if(array==null||array.length==0){
            throw new IllegalAccessException("input array can not be null or wmpty");
        }
        this.array=array;
        size=array.length;
        heapify(); //变成一棵树
    }
    public void heapify(){
        for(int i =size/2-1;i>=0;i--){
            percolateDown(i);
        }
    }
    public MinHeap(int cap){
        if(cap<=0){

        }
    }
    public void percolateDown(int i){

    }
}
