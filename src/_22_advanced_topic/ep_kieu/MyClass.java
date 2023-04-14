package _22_advanced_topic.ep_kieu;

public class MyClass {
    public static void main(String[] args) {
        int a = 5;
        float b;
        // ep kieu ngam dinh
        b = a;
        System.out.println(a + " " + b);

        int x;
        float y = 5.5f;
        // ep kieu tuong minh
        x = (int) y;
        System.out.println(x);

        Person person = new Student();
        person.setName("Steven");
        System.out.println(person.getName());

        ((Student)person).setClassRoom("1A");
        System.out.println(person.getName() + "  " +((Student) person).getClassRoom());
    }
}
