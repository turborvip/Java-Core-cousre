package _12_4_properties_opject_oriented_program.inheritance;

public class Employee extends Person{

    private String job;

    public Employee(String name, String age, String address, String job) {
        super(name, age, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
