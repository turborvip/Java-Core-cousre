package _20_work_with_file;

import _20_work_with_file.common.FileUtils;
import _20_work_with_file.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static final String FILE_NAME = "src/_20_work_with_file/data/student.csv";
    public static final String COMMA = ",";

    public static void main(String[] args) {
        // Output file
        Student student1 = new Student(1,"John","20/2/2000");
        Student student2 = new Student(2,"David","20/7/2002");
        Student student3 = new Student(3,"Steven","11/10/2005");

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        String line = null;
        for (Student student : studentList) {
            line = student.getId() + COMMA + student.getName() + COMMA + student.getDateOfBirth();
            FileUtils.writeFile(FILE_NAME,line);
        }

        // Input file
        List<String> listLine = FileUtils.readFile(FILE_NAME);
        System.out.println(listLine);

        String[] lineSplit = listLine.get(0).split(COMMA);
        Student studentRead = new Student(Integer.parseInt(lineSplit[0]),lineSplit[1],lineSplit[2]);
        System.out.println(studentRead.getId() + " " + studentRead.getName() + " " + studentRead.getDateOfBirth());
    }
}
