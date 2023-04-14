package _22_advanced_topic.comparable_comparator;

import java.util.Comparator;

public class AgeStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
