package _18_generic;

public class GenericExample2 {
    public static <T> void printElement(T[] t){
        for (T o : t){
            System.out.print(o + "\t");
        }
    }

    public static void main(String[] args) {
        Integer[] myArrInt = {1,2,3,4,5};
        Double[] myArrDouble = {1.1,2.2,3.3,4.4};
        String[] myArrStr = {"A","B","C","D"};

        printElement(myArrInt);
        System.out.println();
        printElement(myArrDouble);
        System.out.println();
        printElement(myArrStr);
    }
}
