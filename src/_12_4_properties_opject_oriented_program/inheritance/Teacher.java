package _12_4_properties_opject_oriented_program.inheritance;

public class Teacher extends Person{
    private String object;

    private String level;

    public Teacher(String name, String age, String address, String object, String level) {
        super(name, age, address);
        this.object = object;
        this.level = level;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
