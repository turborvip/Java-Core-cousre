package _13_Abstract_class;

public class MainClass {
    public static void main(String[] args) {
        Person student = new Student();
        Person employee = new Employee();

        student.learn();
        employee.learn();


    }
}
