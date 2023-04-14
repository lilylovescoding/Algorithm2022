package Package4_Queue_Stack_5Q.SelfPractice;
import java.util.*;

public class Queue_Stack {
    public static void main(String[] args){
        Queue<Integer> quene = new ArrayDeque< >();
        quene.offer(1);
        quene.offer(2);
        quene.offer(3);
        System.out.println(quene);
        System.out.println(quene.peek());
        int size=quene.size();
        for (int i=0;i<size;i++){
            System.out.print(quene.poll());
        }
        System.out.println();


        Deque<Integer>stack=new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        int size2=stack.size();
        for (int i=0;i<size2;i++){
            System.out.print(stack.pop());
        }
        System.out.println();


        Deque<Integer>deque=new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.offerLast(5);
        deque.offerLast(6);
        System.out.println(deque);
        int size1=deque.size();
        for (int i=0;i<size1;i++){
            System.out.print(deque.pop());
        }
        System.out.println();
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        Deque<Integer>deque2=new ArrayDeque<>();
        deque2.offer(1);
        deque2.offer(2);
        deque2.offer(3);
        deque2.offer(4);
        deque2.offer(5);
        deque2.offer(6);
        System.out.println(deque2);
        int size3=deque2.size();
        for (int i=0;i<size3;i++){
            System.out.print(deque2.pop());
        }
    }
}
