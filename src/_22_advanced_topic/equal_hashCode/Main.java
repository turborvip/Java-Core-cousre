package _22_advanced_topic.equal_hashCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Steven");
        Student student2 = new Student(1,"Steven");

        System.out.println(student1.equals(student2));

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        int zero = 0 ;

        for (Student student:studentSet) {
            System.out.println(student.getId());
        }
    }
}
