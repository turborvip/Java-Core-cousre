package _11_AccessModifier.packet1;

public class Person {
    //private modify
    private String name;

    //default modify
    int age;

    protected int weight;

    public String gender;

    String getName(){
        return this.name;
    }
}
