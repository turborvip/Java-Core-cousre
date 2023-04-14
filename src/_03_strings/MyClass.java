package _03_strings;

public class MyClass {
    public static void main(String[] args){
        String str = "Hello world";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));

        String firstName = "Dat";
        String lastName = "Thanh Dat";

        System.out.println(firstName.concat(lastName));

        System.out.println("Do Thanh \" Dat");
        System.out.println("hello \nworld");
        System.out.println("hello \tworld");
        System.out.println("hello \bworld");

        int x = 10;
        int y = 20;
        int z = x+ y;
        System.out.println(z);

        String l = "10";
        String m = "20";
        String k = l + m;
        System.out.println(k);

    }
}
