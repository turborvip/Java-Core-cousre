package _16_data_structures_and_algorithms._map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyClass {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"one");
        myMap.put(2,"two");
        myMap.put(3,"three");

        System.out.println(myMap.get(2));

        for (Integer key:myMap.keySet()) {
            System.out.println(myMap.get(key)+ '\t');
        }

        Map<Integer,String> myMap2 = new HashMap<>();
        myMap2.put(4,"four");
        myMap2.put(5,"five");

        myMap.putAll(myMap2);

        System.out.println(myMap.size());
        System.out.println(myMap.containsKey(9));
        System.out.println(myMap.containsValue("five"));

        myMap.remove(4);
        myMap.clear();

        System.out.println("-----------------------------");
        //Hay the nhi thang iterator...@@
        Iterator<String> iterator = myMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
