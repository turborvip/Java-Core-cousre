package _16_data_structures_and_algorithms._list;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> mylist1 = new ArrayList<>();

        mylist1.add("a");
        mylist1.add("b");
        mylist1.add("c");

        System.out.println("----------------------------");
        for (String element : mylist1) {
            System.out.println(element + '\t');
        }

        List<String> mylist2 = new ArrayList<>();
        mylist2.add("e");
        mylist2.add("f");

        mylist1.addAll(mylist2);

        System.out.println("-----------------------");
//        for (String element:mylist1) {
//            System.out.println(element + "\t");
//        }
        System.out.println(mylist1.size());
        System.out.println(mylist1.get(0));
        mylist1.set(0, "new elememt");
        System.out.println(mylist1.get(0));
        System.out.println(mylist1.indexOf("e"));
        mylist1.add("e");
        System.out.println(mylist1.lastIndexOf("e"));
        mylist1.remove(2);
//        mylist1.clear();
//        System.out.println(mylist1.size());
        System.out.println(mylist1.contains("e"));

        List<String> newList = mylist1.subList(1, 2);

        for (String element : newList) {
            System.out.println(element + "\t");
        }

    }
}

