package _22_advanced_topic.ep_kieu;

public class Teacher extends Person {
    public String level;

    public Teacher() {
    }

    public Teacher(String level) {
        this.level = level;
    }

    public Teacher(String name, String level) {
        super(name);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
