package _11_AccessModifier.packet1;

public class Main1 {
    public static void main(String[] args) {
        Person human = new Person();
        //error because name is private properties.
        //human.name = "Do Thanh Dat";

        //can modify because it is default modify
        human.age = 20;

        //can modify because it is protected modify
        human.weight = 50;

        human.gender = "Male";
    }
}
