package Practice_6_Queue_Stack_Deque;
import java.util.Queue;
import java.util.Arrays;

public class QueueByArray {
    int head;
    int i;
    int size;
    int[] array;

    public QueueByArray(int length){
        array = new int[length];
    }
//    public Queue3() {
//
//    }
    public static void main(String[] args){
        QueueByArray a = new QueueByArray(4);

        a.offer(1);
        a.offer(2);
        a.offer(3);
        a.offer(4);
//        a.offer(3);
//        Integer b = a.poll();
//        System.out.println(b);
    }
    public void offer(int value){
        array[i] = value;
        i = i + 1 == array.length?0:i + 1;
        //i++;
        size++;
        System.out.println(Arrays.toString(array));
    }

    public Integer poll(){
        Integer temp = array[head];
        head = head + 1 == array.length?0:head + 1;
        size--;
        return temp;
    }

    public int peek(){
        return array[head];
    }

    public int size(){
        return size;
    }
}


