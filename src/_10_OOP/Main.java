package _10_OOP;

public class Main {
    public static void main(String[] args) {

        Person alex = new Person();
        alex.setName("Alex");
        alex.setAge(20);

        Flour flourBakery = new Flour();
        flourBakery.setName("Bot mi");
        flourBakery.setSize(1);

        alex.setFlour(flourBakery);

        alex.makeBakery(flourBakery);
    }
}
