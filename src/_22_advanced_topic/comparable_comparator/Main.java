package _22_advanced_topic.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Hai", 20));
        listStudent.add(new Student("Abc", 21));
        listStudent.add(new Student("Xyz", 18));
        // Cach 1 dai nhung tai su dung duoc....
        Collections.sort(listStudent,new AgeStudentComparator());
        // Cach 2 chi viet duoc 1 lan khong tai su dung duoc
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Student student : listStudent) {
            System.out.println(student.getName());
        }

    }
}
