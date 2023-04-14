package _22_advanced_topic.ep_kieu;

public class Student extends Person {
    private String classRoom;

    public Student() {
    }

    public Student(String classRoom) {
        this.classRoom = classRoom;
    }

    public Student(String name, String classRoom) {
        super(name);
        this.classRoom = classRoom;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
}
