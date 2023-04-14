package _17_Collectiions_in_Java.using_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        Collections.addAll(myList, 2, 1, 3, 4, 5, 6, 7, 8);
        System.out.println(myList);

        //sap xep cac phan tu cua 1 tap hop sort()
        Collections.sort(myList);
        System.out.println(myList);

        //Tim kiem nhi phan binarySearch()
        System.out.println(Collections.binarySearch(myList, 4));

        //Dao nguoc cac phan tu trong tap hop reverse()
        Collections.reverse(myList);
        System.out.println(myList);

        //Xao tron cac phan tu trong tap hop shuffle
        Collections.shuffle(myList);
        System.out.println(myList);

        //Thay doi phan tu o index thanh 1 gia tri khac
        Collections.replaceAll(myList,1,100);
        System.out.println(myList);

    }
}
