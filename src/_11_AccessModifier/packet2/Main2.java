package _11_AccessModifier.packet2;

import _11_AccessModifier.packet1.Person;

public class Main2 {
    public static void main(String[] args) {
        Person woman = new Person();

        //Error private modify
        //woman.name = "Mai An Tuc";

        //Cannot modify
        //woman.weight = 40;

        woman.gender = "Female";
    }
}
