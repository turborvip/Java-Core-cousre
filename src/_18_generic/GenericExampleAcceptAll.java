package _18_generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GenericExampleAcceptAll {

    /* Han che cua generic : 1. La khong the goi generic voi du lieu nguyen thuy
                             2. Khong the tao instance cho kieu su lieu generic
                             3. Khong the su dung static cho kieu du lieu generic
                             4. Khong the tao mang generic
                             5. Khong the tao duoc class ngoai le la Exception
    */
    public static void printElement(List<? extends Number> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
    public static void main(String[] args) {
        List<Integer> myListInt = new ArrayList<Integer>();
        myListInt.add(1);
        myListInt.add(2);
        myListInt.add(3);
        myListInt.add(4);

        List<Double> myListDouble = new ArrayList<Double>();
        myListDouble.add(1.1);
        myListDouble.add(2.2);
        myListDouble.add(3.3);
        myListDouble.add(4.4);
        myListDouble.add(5.5);

        List<String> myListString = new ArrayList<String>();
        myListString.add("a");
        myListString.add("b");
        myListString.add("c");
        myListString.add("d");
        myListString.add("e");

        printElement(myListDouble);

    }
}
