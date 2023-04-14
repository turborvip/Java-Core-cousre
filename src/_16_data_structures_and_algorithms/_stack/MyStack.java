package _16_data_structures_and_algorithms._stack;

import java.util.Iterator;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        //peek tra ve phan tu dau tien cua stack o day la 4
        System.out.println(myStack.peek());

        //kiem tra kich thuoc stack ta dung size
        System.out.println(myStack.size());

        //lay phan tu dau stack va xoa no dung pop
        System.out.println(myStack.pop());
        System.out.println(myStack.size());

        //Tim kiem phan tu trong stack dung search
        System.out.println(myStack.search(2));

        //Lap qua cac phan tu trong stack dung iterate
        Iterator iterator = myStack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
