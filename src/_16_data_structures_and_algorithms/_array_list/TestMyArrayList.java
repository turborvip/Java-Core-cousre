package _16_data_structures_and_algorithms._array_list;

public class TestMyArrayList {
    static class Person {
        String name;
        int Age;

        public Person(String name, int age) {
            this.name = name;
            Age = age;
        }

        @Override
        public String toString() {
            return "Person{" + "name=" + name + '\'' + ", Age= " + Age + '}';
        }

        @Override
        public boolean equals(Object obj) {
            return this.name.equals(((Person) obj).name) && this.Age == ((Person) obj).Age;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        MyArrayList<Person> myArrayList = new MyArrayList<>(2);
        myArrayList.ensureCapacity(4);
        myArrayList.add(new Person("Turborvip", 20));
        myArrayList.add(new Person("Nguyen Van B", 30));
        myArrayList.add(new Person("Nguyen Van C", 30));
        myArrayList.add(new Person("Nguyen Van D", 30), 1);
        myArrayList.remove(2);
        MyArrayList<Person> myArrayList2 = myArrayList.clone();
        for (int i = 0; i < myArrayList2.size(); i++) {
            System.out.println(myArrayList2.get(i).toString());
        }

        int index = myArrayList2.indexOf(new Person("Nguyen Van C", 30));
        System.out.println("index = "+index);
    }
}
