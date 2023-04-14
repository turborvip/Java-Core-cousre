package _17_Collectiions_in_Java._iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterator {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        Iterator<Integer> iterator = myList.iterator();
        System.out.println(myList);

        System.out.println("-------------------------");
        while (iterator.hasNext()){
            Integer element = iterator.next();
            if (element <= 3){
                iterator.remove();
            }
        }

        System.out.println(myList);

    }
}
