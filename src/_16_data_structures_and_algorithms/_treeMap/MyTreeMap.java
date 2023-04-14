package _16_data_structures_and_algorithms._treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "two");
        treeMap.put(1, "one");
        treeMap.put(3, "three");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("-------------------------");
        treeMap.remove(2);
        Iterator iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--------------------------");
        System.out.println(treeMap.put(2, "two_update"));
        System.out.println(treeMap.get(2));
    }
}
