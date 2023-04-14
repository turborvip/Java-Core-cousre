package _12_4_properties_opject_oriented_program.inheritance;

public class Student extends Person {

    private Double diemTb;
    private String classRoom;

    public Student(String name, String age, String address, Double diemTb) {
        super(name, age, address);
        this.diemTb = diemTb;
    }

    public Double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(Double diemTb) {
        this.diemTb = diemTb;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
}
