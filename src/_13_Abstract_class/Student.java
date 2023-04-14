package _13_Abstract_class;

import _14_Interface.Playable;

public class Student extends Person implements Playable {
    private String className;
    private Double grade;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public void learn(){
        System.out.println("Tham khao cac giao trinh o truong hoc!!!");
    };

    @Override
    public void playGame() {
        System.out.println("Chim chuot");
    }
}
