package _22_advanced_topic.equal_hashCode;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Student)){
            return false;
        }
        Student otherStudent = (Student) obj;
        if (this.id == otherStudent.id){
            return true;
        }else {
            return false;
        }
    }

    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
