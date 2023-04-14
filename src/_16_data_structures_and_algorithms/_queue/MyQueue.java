package _16_data_structures_and_algorithms._queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("a");
        myQueue.offer("b");
        myQueue.add("c");
        //Lay phan tu dau hang doi
        System.out.println(myQueue.peek());
        System.out.println(myQueue.element());

        System.out.println("-------------------------------");
        //Lay ra phan tu o dau queue va xoa no
        System.out.println(myQueue.poll());
        System.out.println(myQueue.remove());

        System.out.println("--------------------------------");
        System.out.println(myQueue.isEmpty());

        //System.out.println("---------------------------------");
        //myQueue.clear();
        //System.out.println(myQueue.isEmpty());

        System.out.println("---------------------------------");
        System.out.println(myQueue.contains("c"));

        System.out.println("---------------------------------");
        System.out.println(myQueue.size());

        Iterator iterator = myQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
