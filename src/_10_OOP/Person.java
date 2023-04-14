package _10_OOP;

public class Person {
    private String name;
    private  int age;

    private Flour flour;

    public void makeBakery(Flour flour){
        System.out.println(this.name + " Make a bakery " + flour.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }

    public Flour getFlour() {
        return flour;
    }
}
