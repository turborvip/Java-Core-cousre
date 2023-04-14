package _18_generic;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class GenericExample1 {
    public static void main(String[] args) {
        ArrayList <String> myList = new ArrayList<String>();
        myList.add("Turborvip");
        myList.add("Turborvip2");
        myList.add("Turborvip3");
        System.out.println(myList);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(1);
        //No se tu loai bo phan tu trung lap :))) ao ma canada taybannha
        System.out.println(mySet);
    }
}
