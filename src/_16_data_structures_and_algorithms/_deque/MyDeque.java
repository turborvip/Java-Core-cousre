package _16_data_structures_and_algorithms._deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MyDeque {
    public static void main(String[] args) {
        Deque<Integer> myDeque = new LinkedList();

        //Them cuoi danh sach add(), offerLast(), addLast()
        myDeque.add(1);
        myDeque.addLast(2);
        myDeque.offerLast(3);

        //Them vao dau push(), addFirst, offerFirst
        myDeque.push(4);
        myDeque.push(5);
        myDeque.push(6);

        //Truy xuat mot phan tu dau danh sach peek(), peekFirst, getFirst
        System.out.println(myDeque.peek());
        System.out.println(myDeque.peekFirst());
        System.out.println(myDeque.getFirst());

        //Truy xuat phan tu o cuoi danh sach peekLast(), getLast(),
        System.out.println(myDeque.peekLast());
        System.out.println(myDeque.getLast());

        //Xoa 1 phan tu o dau danh sach remove(), poll(), removeFirst(), pollFirst()
        //Xoa 1 phan tu o cuoi danh sach removeFirst(), pollFirst()

        //Kiem tra 1 phan tu co trong danh sach contains()
        //Duyet qua cac phan tu ta dung itegrate hoac for :)))) de ~~~

        System.out.println("--------------------------");
        Iterator<Integer> iterator = myDeque.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
    }
}
