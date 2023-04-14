package _07_array;

public class MyArray {
    public static void main(String[] args) {
        String myArray[];
        String[] myArray_1 = {"Volvo","BWM","Ford","Mazda"};
        String[] myArray_2 = new String[10];

        System.out.println(myArray_1[myArray_1.length - 1]);

        myArray_1[0] = "Toyota";

        System.out.println(myArray_1[0]);

        for(String element : myArray_1){
            System.out.print(element + "\t");
        }

        int[] x = {1,3,4};
    }
}
