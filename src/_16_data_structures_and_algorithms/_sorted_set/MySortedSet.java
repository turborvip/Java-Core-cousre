package _16_data_structures_and_algorithms._sorted_set;


import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MySortedSet {
    public static void main(String[] args) {
        TreeSet sortedSet = new TreeSet();

        sortedSet.add("a");
        sortedSet.add("c");
        sortedSet.add("b");

        Iterator<String> myIterator = sortedSet.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }

        System.out.println("first : " + sortedSet.first());
        System.out.println("last : " + sortedSet.last());

        System.out.println("headSet");

        //sortedSet.remove("c");

        System.out.println("-------------------------");
        Iterator<String> myIterator1 = sortedSet.descendingIterator();
        while (myIterator1.hasNext()) {
            System.out.println(myIterator1.next());
        }

        SortedSet headSet = sortedSet.headSet("c");
        System.out.println("-------------------------");
        Iterator<String> myIterator2 = headSet.iterator();
        while (myIterator2.hasNext()) {
            System.out.println(myIterator2.next());
        }

        SortedSet tubor = sortedSet.tailSet("b");
        System.out.println("-------------------------");
        Iterator<String> myIterator3 = tubor.iterator();
        while (myIterator3.hasNext()) {
            System.out.println(myIterator3.next());
        }
    }
}
